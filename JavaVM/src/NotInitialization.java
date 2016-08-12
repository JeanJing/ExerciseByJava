class SuperClass{
	static{
		System.out.println("superclass inti!");
	}
	public static int value = 123;
}
class SubClass extends SuperClass{
	static{
		System.out.println("subclass inti!");
	}
}
public class NotInitialization {
	public static void main(String args[]){
		System.out.println(SubClass.value);
		//SuperClass[] sca = new SuperClass[10];
	}
}
