package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
//ʵ�ֶ��нӿڵ�����linkedlist�Լ�
public class StudyQueue {
	public static void main(String args[]){
		Queue<String> que = new LinkedList<String>();
		LinkedList<String> list = new LinkedList<String>();//�������
		
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
		Deque<String> arrayQueue = new ArrayDeque<String>();//��Ϊ��Щ�������ȶ�ʵ����queue�ӿ������л�����add��remove������
		                                                    //��ͬʱ�о���˫�˶��е�addfirst��addlast�Ȳ���
		arrayQueue.add("jing");
		arrayQueue.add("zhen");
		arrayQueue.add("yan");
		System.out.println(arrayQueue);
	
	}

}
