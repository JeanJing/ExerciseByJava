import java.util.*;

public class ��������_���Ͳ��� {
	public static void main(String args[]){
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<String>  array2 = new ArrayList<>();
		if(array.getClass() == array2.getClass())
		System.out.println("1 �˽�getClass������2��ⷺ�͵�һЩ���ƣ��Լ�������java������еľ���ʵ��");
		System.out.println(array.getClass());
		System.out.println(ArrayList.class);
		LinkedList<Integer> hashtable[] = new LinkedList[20];//
		//LinkedList<Integer> hashtable_2 = new LinkedList<Integer>[20;]
		hashtable[0] = new LinkedList<Integer>();
		hashtable[1] = new LinkedList<String>();//Ҳ����˵�������
		LinkedList<Integer> hashtable_3[] =(LinkedList<Integer>[])new LinkedList<?>[20];//
		hashtable_3[0] = new LinkedList<Double>();
		
	}

}
