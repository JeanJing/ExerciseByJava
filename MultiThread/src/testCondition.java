import java.util.concurrent.locks.*;


public class testCondition {

}
class task implements Runnable{
	ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Condition condition = lock.newCondition();
		condition.
		
	}
	
}
