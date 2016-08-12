public class RunAndStartTestInThread {
	public static void main(String[] args) throws InterruptedException {  
		MyThread mt1=new MyThread("线程a");  
		MyThread mt2=new MyThread("线程b");  
		//mt1.run();  

		mt1.start();
		
		mt2.start();  
		Thread t = Thread.currentThread();
		mt1.interrupt();
		int i = 10;
		while(i > 0){
		Thread.sleep(60);
		System.out.println(t.isInterrupted());
		i--;
		}
		System.out.println(t.getName());//弄了半天的到的是主函数
		System.out.println(t.getPriority());//线程默认优先级是5
		System.out.println(Thread.MAX_PRIORITY);
	}  
}

class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("线程开始：" + this.name + ",i=" + i);
		}
	}
}