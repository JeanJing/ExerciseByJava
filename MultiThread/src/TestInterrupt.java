
public class TestInterrupt {
	public static void main(String args[]){
		Thread t = new Thread(new TestForInterrupt());
		t.start();
		t.interrupt();
		//Thread.currentThread().interrupt();
		System.out.println("���������н������߳�t���ж�״̬��"+ t.interrupted());
		System.out.println(t.isInterrupted());
	}
	


}
class TestForInterrupt implements Runnable{
	public void run() {
		while(true){
			System.out.println("The thread running...");
			long currentTime = System.currentTimeMillis();
			while( System.currentTimeMillis() - currentTime < 1000)
				;
				
		}
		
	}
	
}