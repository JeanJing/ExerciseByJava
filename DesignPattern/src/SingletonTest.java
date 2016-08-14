import java.util.concurrent.*;
public class SingletonTest {
	public static void main(String args[]){
		ExecutorService exec = Executors.newCachedThreadPool();
		while(true){
			exec.execute(new ExecuteSingleton());
		}
		
	}
	

}
class ExecuteSingleton implements Runnable{

	@Override
	public void run() {
		Singleton.getInstance();
		
	}
	
}
class Singleton
{
    private volatile static Singleton singleton = null;
    private Singleton()  {    }
    public static Singleton getInstance()   {
        if (singleton== null)  {
            synchronized (Singleton.class) {
                if (singleton== null)  {
                    singleton= new Singleton();
                }
            }
        }
        return singleton;
    }
}