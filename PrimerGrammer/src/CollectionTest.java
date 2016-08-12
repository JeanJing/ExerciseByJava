import java.util.*;

public class CollectionTest {
	public static void main(String args[]){
		LinkedList<Integer> list = new LinkedList<Integer>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    LinkedList<Integer> list2 = new LinkedList<Integer>();
        list.clear();
	    list2.add(1);
	    list2.add(2);
	    list2.add(6);
	    list2.add(0, 6);
	   // Iterable
	    //Collection
	    //Iterator
	   // List<Integer> list_3 = new LinkedList<Integer>();
	   // list_3.get(1);//这是线性表所独有的
	    System.out.println(list2);//答案是false，这是有问题的
	    System.out.println();

	}

}
