import java.util.concurrent.*;
public class Exercise1 {
	public static void main(String args[]){
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0; i < 3; i++)
			exec.execute(new PrintTask());
		exec.shutdown();		
	//for(int i = 0; i < 3; i++){
	//	new Thread(new PrintTask()).start();
	///}
	//System.out.println("主线程执行完毕！");
	}

}
class PrintTask implements Runnable{
	private static int taskCount = 0;
	public final int id = taskCount++;
	
	public PrintTask(){ System.out.println("第"+ id+ "任务启动！");}

	@Override
	public void run() {
		for(int i = 0; i < 3; i++){
			System.out.println("第" + id + "个任务执行第" + (i + 1)+ "次");
			Thread.yield();
		}
		System.out.println("第" + id +"任务执行完毕！");
	}
	
}