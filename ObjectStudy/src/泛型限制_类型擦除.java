import java.util.*;

public class 泛型限制_类型擦除 {
	public static void main(String args[]){
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<String>  array2 = new ArrayList<>();
		if(array.getClass() == array2.getClass())
		System.out.println("1 了解getClass函数，2理解泛型的一些限制，以及泛型在java虚拟机中的具体实现");
		System.out.println(array.getClass());
		System.out.println(ArrayList.class);
		LinkedList<Integer> hashtable[] = new LinkedList[20];//
		//LinkedList<Integer> hashtable_2 = new LinkedList<Integer>[20;]
		hashtable[0] = new LinkedList<Integer>();
		hashtable[1] = new LinkedList<String>();//也就是说这个声明
		LinkedList<Integer> hashtable_3[] =(LinkedList<Integer>[])new LinkedList<?>[20];//
		hashtable_3[0] = new LinkedList<Double>();
		
	}

}
