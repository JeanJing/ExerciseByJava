package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StudyLinkedList {
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
		list.add("jing");
		list.add("zhen");
		list.add("yan");
		list.add("no");
		list.add("can");
		
		list.add("no");
		list.add("bibi");
		list.remove();
		///ListIterator<String> iter = list.listIterator();//AbstractList
		//iter.previous();
		//iter.next();
		//iter.add("chen");//这是因为对于iterator这个类来说其本身是
		               //没有add()方法的，公共的接口应该只有hasnext next 以及remove
	  //  String str = iter.next();
	   // String str2 = iter.previous();
	    
		//System.out.println(str);//要想输出previous看来iterator是不可以的
	   // System.out.println(str2);
	    //Iterable
	   // ArrayList<String> al = new ArrayList<String>();
	    //al.iterator().next();
	    //list.listIterator(index)();
		//这个索引值是从1到size这样的
		//不对这个索引值是从0到size
		ListIterator<String> iter_abstract = list.listIterator(0);//AbstractList里面的listiterator方法
		//iter_abstract.next();
		while(iter_abstract.hasNext()){
	     	System.out.println(iter_abstract.next());
			//iter_abstract.remove();
			//System.out.println(list.size());
		}
		
       /* ListIterator<String> iter_LinkedList = list.listIterator();
        while(iter_LinkedList.hasNext()){
			System.out.println(iter_LinkedList.next());
			///iter_LinkedList.remove();
			//System.out.println(list.size());
		}/*
        ListIterator<String> iter= list.listIterator();
        while(iter.hasNext()){
			System.out.println(iter.next());
			//iter_LinkedList.remove();
		}
        System.out.println(list.size());
        */
		ListIterator<String> iter_reverse = list.listIterator(list.size());//现在定位到这个链表的最后一位
		while(iter_reverse.hasPrevious()){
			System.out.println(iter_reverse.previous());
		}
		ListIterator<String> iter_add = list.listIterator(0);
		iter_add.add("brave");
		while(iter_add.hasNext()){
	     	System.out.println(iter_add.next());
			//iter_abstract.remove();
			//System.out.println(list.size());
		}
		System.out.println(list.iterator().next());
		//linkedlistkkkkk
	}

}
