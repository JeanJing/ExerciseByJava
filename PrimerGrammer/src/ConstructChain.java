import java.util.*;
public class ConstructChain {
	public static void main(String args[]){
		new Faculty();
	}
	

}
//ֻҪ��������Ĭ�Ϲ��캯������ô�����еĸ����Ҷ�����ã�ֻ�ǵ�����һ��������
class Faculty extends Employee{
	public Faculty(){//�����޲ι��캯��������û����ʾ���ø�����޲ι��캯������Ҫ������������޲ι��죬��˸������Ҫ���޲ι��캯����������벻ͨ��
		super("jing");//�ӽ����������ÿ�ζ�Ҫ�����޲ι��캯����������в����Ĺ��캯���Ļ�����ֱ�ӵ����вεĹ��캯�������ǿ��Կ������Ǵ����ൽ���ൽ����ĸ��࣬����������ʼ���ǲ����
		super.get();//ͨ��supper���Ե��ø���ķ���
		System.out.println("1 ִ��Faculty�Ĺ��캯��");
	}
}
class Employee extends erson{
	/*public Employee(){
		this("2 ִ���в�����Employee�Ĺ��캯��");
		System.out.println("3 ִ��Employee�Ĺ��캯��");
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
		System.out.println("4 ִ��Person�Ĺ��캯��");
	}
}
