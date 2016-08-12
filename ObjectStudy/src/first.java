import java.util.*;
public class first {
	public static void main(String args[]){
		GregorianCalendar gc = new GregorianCalendar();
		//Date date = null;
		//date.toString();
		//Sum4_Workship_Deity s = new //不在一个工程里就没法调用
		//System.out.println(gc);//这样的对象一般只能用一次，要是多次使用还是最好存在一个变量里好
	    //TestStatic test1 = new TestStatic();
	  //  TestStatic test2 = new TestStatic();
	    //测试结果表明一个类里面可以有多个static的变量
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
	//测试static方法，好像只可以对static变量作用，是这样的吗
	public static void littleTest(){}
	public static void test(){
		//str = "jing";//结果证明static方法只可以对static的数据处理，普通变量是不可以的
		//date = new Date();
		number_1 = 2;
		littleTest();
	}
	public static void main(){
		System.out.println("如果一个类里面可以有main方法就可以单独测试这个类，进行单元测试。");
		for(int i; i < 10;i++){//局部变量必须初始化
			
			
		}
		int i;
		System.out.println(i);
	}

}