import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class BasicThread {
	public static void main(String args[]){
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0; i < 3; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
		System.out.println("waiting for LiftOff£¡");
		/*Thread thread;
		int i = 2;
		while(i-- > 0){
			thread = new Thread(new LiftOff());
			thread.start();
		}*/
		
	}

}
