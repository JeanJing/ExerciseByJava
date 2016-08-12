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
	//System.out.println("���߳�ִ����ϣ�");
	}

}
class PrintTask implements Runnable{
	private static int taskCount = 0;
	public final int id = taskCount++;
	
	public PrintTask(){ System.out.println("��"+ id+ "����������");}

	@Override
	public void run() {
		for(int i = 0; i < 3; i++){
			System.out.println("��" + id + "������ִ�е�" + (i + 1)+ "��");
			Thread.yield();
		}
		System.out.println("��" + id +"����ִ����ϣ�");
	}
	
}