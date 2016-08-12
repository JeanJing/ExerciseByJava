import java.util.concurrent.*;


public class SerialNumberChecker implements Runnable{
	private static CircularSet set = new CircularSet(1000);//这个集合必须是共享的对于所有的任务，负责任务之间就不会存在冲突
    private final int id;
    public SerialNumberChecker(int id){
    	this.id = id;
    }
	@Override
	public void run() {
		while(true){
			int serial = SerialNumberGenerator.nextSerialNumber();
			if(set.contains(serial)){
				System.out.println(serial + " Duplicate");
				System.out.println("第"+ id +"个线程结束");
				System.exit(0);
			}
			set.add(serial);
		}
	}
	public static void main(String args[]){
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 10; i++){
			exec.execute(new SerialNumberChecker(i));
		}
	}
	


}
class SerialNumberGenerator{
	private static volatile int serialNumber  = 0;
	//这里的volitale可以保证serialNumber可以让
	//其他任务随时看见
	public static synchronized int nextSerialNumber(){
		return serialNumber++;
	}
	
}
class CircularSet{
	private int []array;
	private int len;
	private int index = 0;
	public 	CircularSet(int size){
		array = new int[size];
		len = size;
		
		//完成一个初始化
		for(int i = 0; i < len; i++){
			array[i] = -1;
		}
	}
	public synchronized void add(int i){
		array[index] = i;
		
		//然后更新index
		index = ++index % len;
	}
	public synchronized boolean contains(int val){
		for(int i  = 0; i < len; i++)
			if(val == array[i])
				return true;
		return false;
	}
	
}
