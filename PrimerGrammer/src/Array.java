//intention������ĳ��ȿ����ñ������壬���Ǳ���ֵ�仯������ĳ��Ȳ�����֮�仯
import java.awt.List;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class Array {
	public static void main(StringTest args[]){
		/*int n =10;
		int data[] =  new int[n];
		n=20;
		for(int i = 0; i < 20; i++){
		System.out.println(Math.random());//������������Ǵ�0��1��double
		}*/
		/*Random random1 = new Random(100);
        System.out.println(random1.nextInt());
        System.out.println(random1.nextFloat());
        System.out.println(random1.nextBoolean());
        Random random2 = new Random(100);
        System.out.println(random2.nextInt());
        System.out.println(random2.nextFloat());
        System.out.println(random2.nextBoolean());
        Random random = new Random();
        for(int i = 0; i < 10;i++) {
            System.out.println(Math.abs(random.nextInt())%10);
        }
        
		
		Random ran1=new Random();
		Random ran2=new Random();
		//������������Random�Ķ���
		System.out.println("The 1st set of random numbers:");
		System.out.println(" Integer:"+ran1.nextInt());
		System.out.println(" Long:"+ran1.nextLong());
		System.out.println(" Float:"+ran1.nextFloat());
		System.out.println(" Double:"+ran1.nextDouble());
		System.out.println(" Gaussian:"+ran1.nextGaussian());
		          //�����������͵������
		System.out.print("The 2nd set of random numbers:");
		for(int i=0;i<5;i++){
		System.out.println(ran2.nextInt()+" ");
		if(i==2) System.out.println();
		//����ͬ�����͵Ĳ�ͬ���������
		System.out.println();}*/
		/*char []str = {'e', 'a'};
		System.out.println(str.length);
		for(char c: str){
			System.out.println(c);
		}
		*/
		
		/*
		int data[] = {1,2,3,4,5,6,7,8,9,0};
		int da[] =data.clone();
		for(int n:da){
			System.out.println(n);
		}
		int copyData[] = new int[20];
		System.arraycopy(data, 0, copyData, 0, 9);
		for(int n:copyData){
			System.out.println(n);
		}
		int n = 0;
		isChange(n);
	    System.out.println(n);*/
		
		StringTest str = "1";
		check(str);
		System.out.println(str);
		//check2(str);
		str.replace('1', 'j');

		System.out.println(str);
		int data[] = new int[]{3,2,1,4};
		System.out.println(Arrays.toString(data));Arrays.toString(data);
		//ѧϰʹ��Arrays�෽��
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));Arrays.toString(data);
		//ѧϰʹ��Arrays�෽��
		System.out.println(Arrays.binarySearch(data, 100));
		//List a = (List) Arrays.asList(data);//����ͨ��Arrays�ķ����������Ϊ�б�
		int newData[] = Arrays.copyOf(data, 2);//����ĸ���
		System.out.println(Arrays.toString(newData));
	    newData = Arrays.copyOfRange(data, 2, 4);
	    System.out.println(Arrays.toString(newData));
	    //System.out.println(Arrays.toString(newData));
	}
	public static void check2(StringTest str){
		str.replace('1', 'j');
	}
	public static void check(StringTest str){
		str ="hello";
	}
	public static void  isChange(int i){//û��ָ������ã���ô�ı�����ֵ
		i =  i*287+345;
	}
}
