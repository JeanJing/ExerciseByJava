import java.util.concurrent.*;;


public class EvenGenerator extends IntGenerator{
	private int currentEvenValue  = 0;
	@Override
	public synchronized int next() {
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}
	public static void main(String[] args){
		EvenChecker.test(new EvenGenerator());//�����Ļ�����˵generatorֻ��һ��
		
	}

}
abstract class IntGenerator{
	private volatile boolean canceled = false;
	public abstract int next();
	public void cancel(){canceled = true;}
	public boolean isCanceled(){return canceled;}
}
class EvenChecker implements Runnable{
	//��evenchecker��һ��generator����������
    //���checker���Ǽ��generator�Ƿ�ȫ�������Ķ���ż����
    //���������������generator�ͻᱻ����
	private IntGenerator generator;
	
	
	private final int id;
	public EvenChecker(IntGenerator g, int d){
		generator = g;
		id =d;
	}
	public void run(){
		int i  = 0;
		System.out.println(id +"����ʼ");
		while(!generator.isCanceled()){//���checker��������Ǽ��generator�Ƿ����������ֻҪ�����Ĳ���������ѭ���ͻ�һֱ������ȥ
			int val = generator.next();
			if(val % 2 != 0 ){
				System.out.println(val + "not even");
				generator.cancel();
				System.out.println(id +"����������Թرգ���Ӧ��generator��" + generator.isCanceled());
		    }
			//if(i ++ <10)
			//System.out.println(id +"�������ڽ���,currentvalueֵ�ǣ�"+val +"��Ӧ��generator��" + generator+"��Ӧ��״̬��" + generator.isCanceled());
		}
		System.out.println("��"+ id +"�������Ѿ�����");
	}
	public static void test(IntGenerator gp, int count){//�����ͽ����checker��һ��generator������
		System.out.println("Press Control-c to exit");
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < count; i++){
			exec.execute(new EvenChecker(gp, i));
		}
		exec.shutdown();
	}
	public static void test(IntGenerator gp){
		test(gp,10);
	}
}