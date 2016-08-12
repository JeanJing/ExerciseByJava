
public class DynamicBinding {
	public static void main(String args[]){
		Object g = new GraduateStudent();
		 m(g);
		Object s = new Student();
		 m(new Student());
		 Object p = new person();
		 m(p);
		 m(new Object());//这个过程是一个从最底层子类依次向上寻找的一个过程
		 Integer i =Integer.valueOf(0);//肿么把基本数据类型转换成其对应的类型
		 //Student stu = (Student)new Object();
		 Object o = new person();
		// Student stu1 = (Student)o;//这样看起来可以但是，最后会抛出异常
		 //Student stu2 =(Student)new Jing();
		 Object o2 = new Student();
		// o2.print();//虽然o2本身是一个student类型但是，因为声明的是Object类型，所以编译器是无法找到Student类型的方法
		 //必须要强制类型转换
		 Object o3 = new Student();
		 ((Student)o3).print();
		 Object o4 = new person();
		 if(o3 instanceof Student)
			 System.out.println("jing is a pretty girl.");
		 if(o4 instanceof person)
			 System.out.println("chen is a hansome boy.");
		 person stu = new Student();
		 ((Student)stu).print();//强制类型
	}
    public static void m(Object o){
    	System.out.println(o.toString());
    }
}
class GraduateStudent extends Student{
	//public String toString(){
	//	return "GraduateStudent";
	//}
}
class Student extends person{
	public String  print(){
		return "jingjing jiayou!";
	}
	public String toString(){
		return "Student";
	}
}
class person extends Object{
	public String toString(){
		return "Person";
	}
	
}
class Jing{
	public String toString(){
		return "jing is a pretty girl.";
	}
}