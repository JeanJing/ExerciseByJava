import java.io.*;
import java.util.*;

public class DealException {              //�����쳣�������ͨ�����룬���Ƿ�����û�ж��쳣��ʵ���ԵĴ���
	public static void main(String args[]){//ѧϰ�׳��쳣��û�п�������Ҫ�Ľ��
		                                  //�����������쳣
//	int a  = 1 / 0;
//	System.out.println("����������");
		int a = 1;
		int b = 0;
//����Ϊ0�������쳣
/*************
  		try{
		   if(b == 0)
			   //�������û����Ӧ��catch��������쳣����ô���򻹻��쳣����
			   throw new ArithmeticException("��������Ϊ0");//�ֶ��׳��쳣
		   int m = a / b;//�Զ��׳��쳣
		   System.out.println("xiaojin hao kenai");//�쳣�׳�������ִ�������ж�
		   File f = new File("jing.txt");
		   FileInputStream i = new FileInputStream(f);//����Щ�������IOException
		}
		catch(IOException ex){
			System.out.println("������0");
		}
*************/
//���벻ƥ���쳣
/*****************
		Scanner sc = new Scanner(System.in);
		try{
			int data = sc.nextInt();
		}
		catch(InputMismatchException ex){
			System.out.println("����Ĳ�������");
		}
*******************/
		Scanner sc;
		try {
			sc = new Scanner(new File("jingzhenyan.txt"));//��ΪScanner�Ĺ��캯�����׳�������쳣
			System.out.println(sc.next()+"�����в���ѽ");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			// TODO Auto-generated catch block
			e.printStackTrace();//������־ͻ��������ƽʱ�����ĺ����ֵĲ���
			
			//printStackTrace()�����ڿ���̨�����ջ������Ϣ
			//��ʹ�㲻��ȷ���������������Ҳ����ʾ������
		//	System.out.println("jingzhenyan");
		}//����Ϊʲô����û���׳��쳣
		//���������û���ַ������޷����
		//}catch(FileNotFoundException e){//�����쳣�����Գ����ڸ����쳣�ĺ��棬��Ϊ�������쳣���Բ��������쳣�����Ѿ��Ѹ��쳣������ˣ��Ͳ����ٵ������쳣�����������û�������
			
		//}
		
		
	}

}
