import java.util.*;
public class first {
	public static void main(String args[]){
		GregorianCalendar gc = new GregorianCalendar();
		//Date date = null;
		//date.toString();
		//Sum4_Workship_Deity s = new //����һ���������û������
		//System.out.println(gc);//�����Ķ���һ��ֻ����һ�Σ�Ҫ�Ƕ��ʹ�û�����ô���һ���������
	    //TestStatic test1 = new TestStatic();
	  //  TestStatic test2 = new TestStatic();
	    //���Խ������һ������������ж��static�ı���
	    //System.out.println(TestStatic.number_1);
	    //System.out.println(TestStatic.number_2);
	    //System.out jing;
	    //Collections
	  TestStatic ts = new TestStatic();
	  System.out.println(TestStatic.number_1);
	}
}
class TestStatic{
	private String str;
	
	
	static int number_2;
	public Date date;
	//public TestStatic(){
		//number_1 ++;
		//number_2 ++;
	//}
	static int number_1;
	//����static����������ֻ���Զ�static�������ã�����������
	public static void littleTest(){}
	public static void test(){
		//str = "jing";//���֤��static����ֻ���Զ�static�����ݴ�����ͨ�����ǲ����Ե�
		//date = new Date();
		number_1 = 2;
		littleTest();
	}
	public static void main(){
		System.out.println("���һ�������������main�����Ϳ��Ե�����������࣬���е�Ԫ���ԡ�");
		for(int i; i < 10;i++){//�ֲ����������ʼ��
			
			
		}
		int i;
		System.out.println(i);
	}

}