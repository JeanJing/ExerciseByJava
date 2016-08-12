import java.util.*;
import java.io.*;
//java的集合类应该都是可以for each遍历的
public class test {
	public static void main(String args[]) throws FileNotFoundException{
		ArrayDeque<String> a = null;//这样的变量都是不会初始化
		//Iterator<String> b = a.iterator();
		/*String str;
		int n[] = new int[3];
		int m = n.length;
		Collection<String> p;
		System.out.println(Integer.MAX_VALUE);*/
		//PrintWriter pr = new PrintWriter("500.txt");//这个要求抛出异常
		/*Scanner read = new Scanner("500.txt");//是可以这样构建文本流scanner的
		LinkedList<String> list = new LinkedList<String>();
		String str;
		while(read.hasNext()){
			str = read.nextLine();
			list.add(str);
			
		}
		System.out.println("构建的list的长度为："+ list.size());
		long start_1,end_1;
		start_1 = System.currentTimeMillis();
		for(int i = 0; i < list.size(); i++){
			//System.out.print(list.get(i) + " ");
			list.get(i);
		}
		end_1 = System.currentTimeMillis();
		System.out.println(end_1 - start_1);
		
		ListIterator<String> it = list.listIterator();
		long start_2, end_2;
		start_2 = System.currentTimeMillis();
		while(it.hasNext()){
			//System.out.print(it.next());
			it.next();
		}
		end_2 = System.currentTimeMillis();
		System.out.println(end_2 - start_2);
		//System.out.println(list);//在该位置添加一个元素原来的元素不必啊
		//System.out.println(list.toString());
		*/
		
		/**
		 * 测试hash
		 **/
		/*
		HashSet<String> set = new HashSet<String>(4);
		set.add("jing");
		set.add("zhen");
		set.add("yan");
		System.out.println(set);System.out.println("");
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("jing");
		treeSet.add("zhen");
		treeSet.add("yan");
		treeSet.add("chen");
		System.out.println(treeSet);System.out.println("");
		TestComparator com = new TestComparator();
		TreeSet<Jing> tree2 = new TreeSet<>(new TestComparator());
		for(String str: treeSet){
			System.out.println(str);
		}
		Map.Entry<String, Integer>
	*/
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		for(Integer n: list){
			System.out.println(n);
		}
	}

}
class TestComparator implements Comparator<Jing>{//这里是泛型的
	public int compare(Jing o1, Jing o2) {
		return 0;
	}
	
}
class Jing{
	int a1;
	int a2;
}