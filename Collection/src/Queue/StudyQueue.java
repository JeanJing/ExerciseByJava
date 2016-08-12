package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
//实现队列接口的类有linkedlist以及
public class StudyQueue {
	public static void main(String args[]){
		Queue<String> que = new LinkedList<String>();
		LinkedList<String> list = new LinkedList<String>();//这个个噢
		
		que.add("jing");
		que.add("zhen");
		que.add("yan");
		System.out.println(que);
		que.remove();
		System.out.println(que);
		
		list.add("jing");
		list.add("zhen");
		list.add("yan");
		System.out.println(list);
		list.remove();
		System.out.println(list);
		Deque<String> arrayQueue = new ArrayDeque<String>();//因为这些队列首先都实现了queue接口所以有基本的add和remove操作，
		                                                    //但同时有具有双端队列的addfirst和addlast等操作
		arrayQueue.add("jing");
		arrayQueue.add("zhen");
		arrayQueue.add("yan");
		System.out.println(arrayQueue);
	
	}

}
