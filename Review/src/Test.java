import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;


public class Test {
	public static void main(String args[]) throws FileNotFoundException{
		int count[] = new int[10];
		Random rand = new Random(System.currentTimeMillis());//���������util�������
		for(int i = 0; i < 100; i++){
			
			count[rand.nextInt(10)]++;
		}
		for(int n :count)
			System.out.println(n);
		System.out.println(Math.random());//���ص���doubleֵ
		
		int copy_shallow[];
		copy_shallow = count;//�����ǳ������ֻ��������һ���������ã�Ȼ������ָ���ѷ���õ��ڴ�
		System.out.println("����ǳ����");
		for(int i = 0; i < 10; i++){
			System.out.println(copy_shallow[i]);
		}
		System.out.println("������ȿ���");//�������ڴ��еĲ�ͬλ�ã���һ�������ݿ�������һ��
		int copy_deep[];
		copy_deep = count.clone();
		if(copy_deep != count)
			System.out.println("���ڴ���������ռ䣬��ԭ�ȵ����ݸ��Ƶ�������ڴ���");
		if(copy_shallow == count)
			System.out.println("������ǳ������ֻ�ǻ�������");
		int copy_deep_system_arraycopy[] = new int[20];
		System.arraycopy(count, 3, copy_deep_system_arraycopy, 10, 3);
		for(int i = 0; i < copy_deep_system_arraycopy.length; i++){
			System.out.println(copy_deep_system_arraycopy[i]);
		}
		PrintWriter pw = new PrintWriter("jing.txt");
		//�����ȷʵ��֮ǰ�����ݸ�����
		pw.write("jingzhenyanyangfanwohenni wojuebuhui yaujliangni ");//print("in fact, i don't love chen deeply,i just can't forget the dream i make.");
		pw.close();//�����������close��Ȼ�ļ����ͻ����
		
	}

}
