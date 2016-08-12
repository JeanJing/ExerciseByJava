public class testVolatile{

public static void main(String args[]){
   int  jing = 1;
   new Thread(new test()).start();
   System.out.println(jing);
}
}
class test implements Runnable{
	public  volatile int count = 0;

	@Override
	public void run() {
		count++;
		
	}
	
}