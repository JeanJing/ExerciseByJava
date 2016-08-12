import java.util.concurrent.*;;


public class EvenGenerator extends IntGenerator{
	private int currentEvenValue  = 0;
	@Override
	public synchronized int next() {
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}
	public static void main(String[] args){
		EvenChecker.test(new EvenGenerator());//这样的话就是说generator只有一个
		
	}

}
abstract class IntGenerator{
	private volatile boolean canceled = false;
	public abstract int next();
	public void cancel(){canceled = true;}
	public boolean isCanceled(){return canceled;}
}
class EvenChecker implements Runnable{
	//将evenchecker与一个generator关联起来，
    //这个checker就是检查generator是否全部产生的都是偶数，
    //如果有奇数产生，generator就会被撤销
	private IntGenerator generator;
	
	
	private final int id;
	public EvenChecker(IntGenerator g, int d){
		generator = g;
		id =d;
	}
	public void run(){
		int i  = 0;
		System.out.println(id +"任务开始");
		while(!generator.isCanceled()){//这个checker的任务就是检查generator是否产生奇数，只要产生的不是奇数，循环就会一直进行下去
			int val = generator.next();
			if(val % 2 != 0 ){
				System.out.println(val + "not even");
				generator.cancel();
				System.out.println(id +"任务结束可以关闭，对应的generator是" + generator.isCanceled());
		    }
			//if(i ++ <10)
			//System.out.println(id +"任务仍在进行,currentvalue值是："+val +"对应的generator是" + generator+"对应的状态是" + generator.isCanceled());
		}
		System.out.println("第"+ id +"个任务已经结束");
	}
	public static void test(IntGenerator gp, int count){//这样就将多个checker与一个generator关联了
		System.out.println("Press Control-c to exit");
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < count; i++){
			exec.execute(new EvenChecker(gp, i));
		}
		exec.shutdown();
	}
	public static void test(IntGenerator gp){
		test(gp,10);
	}
}