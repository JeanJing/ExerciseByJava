import java.util.concurrent.*;

public class TestPower implements Runnable{
	public static void main(String args[]) throws InterruptedException, ExecutionException{
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 1; i < 30; i++){
			new Thread((new TestPower(new PowerOfNumber(2, 20),i))).start();
		}
	}
    private final int id;
	private boolean isStop = false;
	private PowerOfNumber pow;
	public TestPower(PowerOfNumber pow, int id){
		this.pow = pow;
		this.id = id;
		System.out.println("第"+id +"启动");
	}
	public void run() {
		while(!isStop){
			try {
				pow.pow();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(pow.result() == 1){
				//System.out.println("第"+id +"个线程运行正常");
				pow.resetPowNumber();
			}else{ 
				if(pow.result()!= 1048576){
				isStop = true;
				System.out.println("第"+id +"个线程关闭,pow的结果是："+ pow.result());
				}else{
					//System.out.println("第"+id +"个线程运行正常");
					pow.resetPowNumber();
				}
			    
			}
			
		}
		
	}

}
class PowerOfNumber {//求一个数
	private int baseNumber;
	private int index;
	private int powNumber = 1;
	public PowerOfNumber(int b, int i){
		baseNumber = b;
		index = i;
	}
	public void  pow() throws InterruptedException{
		for(int i = 0; i < index; i++){
			
			powNumber *= baseNumber;
		}
	}
	public int result(){
		return powNumber;
	}
	public void resetPowNumber(){
		powNumber =1;
	}
	
}
