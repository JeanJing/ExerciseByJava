package new2;
abstract class jing{
	private static int m= 0;
	
	public jing(){};//��������Կ�������������й��캯��
	public jing(int n){m  = n;}//��������Կ�������������й��캯��
	//abstract  void forget();//һ��һ������������Ϊabstract��ô��һ���������з����壬����{}
     abstract  int get();//���󷽷�������abstract����
     static void print(){System.out.println("jingzhenyan be brave");}
}
interface zhen{
	int i =0;//�ӿ��еı������Ͷ�������ֻ��Ϊ��public static final
   // private int factor = 0;//��������ֻ����public �����Ķ�������
}
//class zheng{
	//protected  void produce(){
	//	System.out.println("����һ����������");
	///}
//}

public class AbstractClassTest {
	jing xiaojing ;
	public static void main(String args[]){
	  jing.print();
	  System.out.println(zhen.i);
	  Object o1 = new Object();
	  //Object clone = o1.clone();
		//maomao m = new maomao();
		//m.show();
	  Class C = Object.class;//�����Ϳ�����
	}
	
	
}
