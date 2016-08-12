package new2;
abstract class jing{
	private static int m= 0;
	
	public jing(){};//从这里可以看出抽象类可以有构造函数
	public jing(int n){m  = n;}//从这里可以看出抽象类可以有构造函数
	//abstract  void forget();//一旦一个方法被声明为abstract那么它一定不可以有方法体，就是{}
     abstract  int get();//抽象方法必须有abstract修饰
     static void print(){System.out.println("jingzhenyan be brave");}
}
interface zhen{
	int i =0;//接口中的变量类型定义有且只有为：public static final
   // private int factor = 0;//访问属性只能是public 其他的都不可以
}
//class zheng{
	//protected  void produce(){
	//	System.out.println("产生一个宝宝！！");
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
	  Class C = Object.class;//这样就可以了
	}
	
	
}
