import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Exercise6 {
	public static void main(String args[]){
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0; i < 3; i++)
			exec.execute(new TestSleep((int)(Math.random() * 10 + 1)));
		exec.shutdown();
		System.out.println("���߳�ִ����ϣ�");
	//for(int i = 0; i < 3; i++){
	//	new Thread(new PrintTask()).start();
	///}
	//System.out.println("���߳�ִ����ϣ�");
	}
}
class TestSleep  implements Runnable{
	//������һ�ָ�������˳��id�ţ��ķ���
	private static int countTask = 0;
	private final int id = countTask++;
	private int randomInternal = 0;
	public TestSleep(){}
	public TestSleep(int time){
		randomInternal = time * 1000;//���뻻��ɺ���
	}
	public void run(){
		System.out.println("��" + id + "�����������ˣ�" );
		try {
			TimeUnit.MILLISECONDS.sleep(randomInternal);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��" + id + "�������е�ʱ��Ϊ" +randomInternal/1000 +"s.");
		System.out.println("�߳��ǣ�"+ Thread.currentThread());
	}
}