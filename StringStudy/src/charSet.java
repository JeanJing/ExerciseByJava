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
			 //创建字符串"Hello World"， 并赋给引用s
		    String s = "Hello World"; 
		     
		    System.out.println("s = " + s); //Hello World
		     //通过反射获得私有变量的值，好牛逼
		    //获取String类中的value字段
		    Field valueFieldOfString = String.class.getDeclaredField("value");
		     
		    //改变value属性的访问权限
		    valueFieldOfString.setAccessible(true);
		     
		    //获取s对象上的value属性的值
		    char[] value = (char[]) valueFieldOfString.get(s);
		     
		    //改变value所引用的数组中的第5个字符
		    value[5] = '_';
		     
		    System.out.println("s = " + s);  //Hello_World
		    
		    byte []bytes = {98,0,97,0};
		
		    
		    String str = new String(bytes,0,3);
		    System.out.println(str);
		    Arrays.copyOf();
		}
}
