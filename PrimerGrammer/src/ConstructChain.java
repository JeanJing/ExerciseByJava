import java.util.*;
public class ConstructChain {
	public static void main(String args[]){
		new Faculty();
	}
	

}
//只要我这里是默认构造函数，那么我所有的父类我都会调用，只是调用哪一个的区别
class Faculty extends Employee{
	public Faculty(){//对于无参构造函数（并且没有显示调用父类非无参构造函数）它要调用它父类的无参构造，因此父类必须要有无参构造函数，否则编译不通过
		super("jing");//从结果看并不是每次都要调用无参构造函数，如果有有参数的构造函数的话，就直接调用有参的构造函数，但是可以看到的是从子类到父类到父类的父类，这整个过程始终是不变的
		super.get();//通过supper可以调用父类的方法
		System.out.println("1 执行Faculty的构造函数");
	}
}
class Employee extends erson{
	/*public Employee(){
		this("2 执行有参数的Employee的构造函数");
		System.out.println("3 执行Employee的构造函数");
	}*/
	public int get(){
		return 0;
	}
	public Employee(String s){
		System.out.println(s);
	}

}
class erson{
	public erson(){
		System.out.println("4 执行Person的构造函数");
	}
}
