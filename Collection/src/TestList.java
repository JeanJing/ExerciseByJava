import java.util.*;
public class TestList {
	public static void main(String []args){
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		//list.add(0);
	    //list.add(2);
		//Collections.sort(list);//�����������������򣬼���������Լ���������򣬷ֱ����Arrays���Collections��ľ�̬������
	    System.out.println(list);//������Ҳ���Կ�����linkedlist�Ѳ������������������
		list.add(0);
	    list.add(2);//ǰ������ź���ĺ���Ͳ�����
	    System.out.println(list);
	    
	    Collections.reverse(list);//Collections����ķ��������������
	    System.out.println(list);
	    
	    Collections.shuffle(list);//���ڿ��Կ���collection���淽�����Խ��������������
	    System.out.println(list);
	    //Integer[] data = (Integer[])list.toArray();//����ǿ������ת�������쳣�׳�
	 
	    Integer []data = list.toArray(new Integer[0]);//���� ����һ������Ϊ0�����飬�����￴�������ģ�����Ĳ���������Ϊ��ͨ��ģ�壬ʹ�÷���ֵ������ȷ
	    System.out.println("data�ĵ�һ��Ԫ����"+data[0]);
	    List<Integer> list_2 = new LinkedList<Integer>();//����������ͬһ�����͵�list�ſ��Ը���
	    
	    list_2.add(0);
	    list_2.add(1);
	    list_2.add(2);
	    list_2.add(3);
	    list_2.add(4);
	    list_2.add(5);
	    //list_2.add(6);
	    Collections.copy(list_2, list);//���ʼ��ʱ���ҽ�������һ��LinkedList�������޷����ƣ�copy����Ŀ��ĳ��ȱ����Ǵ��ڵ���Դ�б��ȵ�
	    System.out.println(list_2);
	    
	    System.out.println(list.contains(132));
	    
	}

}
