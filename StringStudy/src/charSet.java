import java.lang.reflect.Field;
import java.util.Arrays;


public class charSet {
		public static void main(String args[]) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{
			/*char   []  test = new char[3];
			test[0] = '1';
			test[1] = '2';
			test[2] = '3';
			test[2] = '4';
			char [] another ={'1','2'};
			test = another;
			for(int i = 0; i < test.length; i++){
				System.out.println(test[i]);
			}*/
			 //�����ַ���"Hello World"�� ����������s
		    String s = "Hello World"; 
		     
		    System.out.println("s = " + s); //Hello World
		     //ͨ��������˽�б�����ֵ����ţ��
		    //��ȡString���е�value�ֶ�
		    Field valueFieldOfString = String.class.getDeclaredField("value");
		     
		    //�ı�value���Եķ���Ȩ��
		    valueFieldOfString.setAccessible(true);
		     
		    //��ȡs�����ϵ�value���Ե�ֵ
		    char[] value = (char[]) valueFieldOfString.get(s);
		     
		    //�ı�value�����õ������еĵ�5���ַ�
		    value[5] = '_';
		     
		    System.out.println("s = " + s);  //Hello_World
		    
		    byte []bytes = {98,0,97,0};
		
		    
		    String str = new String(bytes,0,3);
		    System.out.println(str);
		    Arrays.copyOf();
		}
}
