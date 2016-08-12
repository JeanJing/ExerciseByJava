//之前写的代码，执行一个任务都是先启动
public class SimpleThread extends Thread{
	private int countDown = 5;
	private static int threadCount = 0;
	public SimpleThread(){
		super(Integer.toString(++threadCount));
		start();//这里调用start函数我不太懂
	}
	public String toString(){
		return "#" + getName() +"(" + countDown +"),";
	}
	public void run(){
		while(true){
			System.out.print(this);//会调用这个类的tostring方法
			if(--countDown == 0)
				return;//直接跳出方法
		}
	}
	public static void main(String[] args){
		for(int i = 0; i < 5; i++)
			new SimpleThread();
	}
}
