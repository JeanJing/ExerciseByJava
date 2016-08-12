	import java.util.ArrayList; 
import java.util.List; 
import java.util.Random;
import java.util.concurrent.Callable; 
import java.util.concurrent.ExecutionException; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
import java.util.concurrent.Future; 
import java.util.concurrent.FutureTask; 
  	  
  	public class ConcurrentCalculator { 
  	  
  	    private ExecutorService exec; 
  	    private int cpuCoreNumber; 
  	    private List<Future<Long>> tasks = new ArrayList<Future<Long>>(); 
  	  
  	    // 内部类 
  	    class SumCalculator implements Callable<Long> { 
           private int[] numbers; //这个内部类用来计算数组
           private int start; 
  	        private int end; 
  	  
  	        public SumCalculator(final int[] numbers, int start, int end) { 
  	            this.numbers = numbers; 
  	            this.start = start; 
  	            this.end = end; 
  	        } 
  	  
           public Long call() throws Exception {//这个任务要做的东西，那么并行体现在哪里 
               Long sum =  (long) 1 ; 
               for (int i = start; i < end; i++) { 
  	                sum += numbers[i]; 
  	            } 
  	            return sum; 
  	        } 
  	    } 
  	  
  	    public ConcurrentCalculator() { 
           cpuCoreNumber = Runtime.getRuntime().availableProcessors(); 
           exec = Executors.newFixedThreadPool(cpuCoreNumber); 
       } 
     
  	    public Long sum(final int[] numbers) { 
  	        // 根据CPU核心个数拆分任务，创建FutureTask并提交到Executor 
  	        for (int i = 0;  i < cpuCoreNumber; i++) { 
  	            int increment = numbers.length / cpuCoreNumber + 1;   
  	            int start = increment * i; 
  	            int end = increment * i + increment; 
                if(end > numbers.length) 
                   end = numbers.length; 
               SumCalculator subCalc = new SumCalculator(numbers, start, end); 
               FutureTask<Long> task = new FutureTask<Long>(subCalc); 
               tasks.add(task); 
  	            if (!exec.isShutdown()) { 
  	                exec.submit(task); 
  	            } 
  	        } 
  	        return getResult(); 
       } 
     
       /** 
        * 迭代每个只任务，获得部分和，相加返回 
        *  
        * @return 
  	     */
  	    public Long getResult() { 
  	        Long result = (long) 1; 
  	        for (Future<Long> task : tasks) { 
               try { 
                   // 如果计算未完成则阻塞 
                   Long subSum = task.get(); 
                   result += subSum; 
               } catch (InterruptedException e) { 
                   e.printStackTrace(); 
               } catch (ExecutionException e) { 
  	                e.printStackTrace(); 
  	            } 
  	        } 
           return result; 
       } 
     
       public void close() { 
           exec.shutdown(); 
       } 
       public static void main(String args[]){
    		int[] numbers = new int[10];// { 1, 2, 3, 4, 5, 6, 7, 8, 10, 11 }; 
    		Random random = new Random(System.currentTimeMillis());
    		for(int i = 0; i < numbers.length; i++)
    			numbers[i] = random.nextInt();
    		
    		ConcurrentCalculator calc = new ConcurrentCalculator();
    		long start = System.currentTimeMillis();
    		Long sum = calc.sum(numbers); 
    		long end = System.currentTimeMillis();
    		System.out.println(sum + " " + (end - start)); 
    		calc.close();
    		long sum2 = 0;
    		start = System.currentTimeMillis();
    		for(int i = 0; i < numbers.length; i++)
    			sum2 += numbers[i];
    		end = System.currentTimeMillis();
    		System.out.println(sum2 + " " + (end - start));
       }
  	}

  
