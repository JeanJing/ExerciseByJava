import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Exercise6 {
	public static void main(String args[]){
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0; i < 3; i++)
			exec.execute(new TestSleep((int)(Math.random() * 10 + 1)));
		exec.shutdown();
		System.out.println("主线程执行完毕！");
	//for(int i = 0; i < 3; i++){
	//	new Thread(new PrintTask()).start();
	///}
	//System.out.println("主线程执行完毕！");
	}
}
class TestSleep  implements Runnable{
	//这样的一种给定任务顺序（id号）的方法
	private static int countTask = 0;
	private final int id = countTask++;
	private int randomInternal = 0;
	public TestSleep(){}
	public TestSleep(int time){
		randomInternal = time * 1000;//将秒换算成毫秒
	}
	public void run(){
		System.out.println("第" + id + "个任务启动了！" );
		try {
			TimeUnit.MILLISECONDS.sleep(randomInternal);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("第" + id + "任务运行的时间为" +randomInternal/1000 +"s.");
		System.out.println("线程是："+ Thread.currentThread());
	}
}