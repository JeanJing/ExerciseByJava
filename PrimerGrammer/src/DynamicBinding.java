
public class DynamicBinding {
	public static void main(String args[]){
		Object g = new GraduateStudent();
		 m(g);
		Object s = new Student();
		 m(new Student());
		 Object p = new person();
		 m(p);
		 m(new Object());//���������һ������ײ�������������Ѱ�ҵ�һ������
		 Integer i =Integer.valueOf(0);//��ô�ѻ�����������ת�������Ӧ������
		 //Student stu = (Student)new Object();
		 Object o = new person();
		// Student stu1 = (Student)o;//�������������Ե��ǣ������׳��쳣
		 //Student stu2 =(Student)new Jing();
		 Object o2 = new Student();
		// o2.print();//��Ȼo2������һ��student���͵��ǣ���Ϊ��������Object���ͣ����Ա��������޷��ҵ�Student���͵ķ���
		 //����Ҫǿ������ת��
		 Object o3 = new Student();
		 ((Student)o3).print();
		 Object o4 = new person();
		 if(o3 instanceof Student)
			 System.out.println("jing is a pretty girl.");
		 if(o4 instanceof person)
			 System.out.println("chen is a hansome boy.");
		 person stu = new Student();
		 ((Student)stu).print();//ǿ������
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