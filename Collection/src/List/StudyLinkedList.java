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
		//iter.add("chen");//������Ϊ����iterator�������˵�䱾����
		               //û��add()�����ģ������Ľӿ�Ӧ��ֻ��hasnext next �Լ�remove
	  //  String str = iter.next();
	   // String str2 = iter.previous();
	    
		//System.out.println(str);//Ҫ�����previous����iterator�ǲ����Ե�
	   // System.out.println(str2);
	    //Iterable
	   // ArrayList<String> al = new ArrayList<String>();
	    //al.iterator().next();
	    //list.listIterator(index)();
		//�������ֵ�Ǵ�1��size������
		//�����������ֵ�Ǵ�0��size
		ListIterator<String> iter_abstract = list.listIterator(0);//AbstractList�����listiterator����
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
		ListIterator<String> iter_reverse = list.listIterator(list.size());//���ڶ�λ�������������һλ
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
