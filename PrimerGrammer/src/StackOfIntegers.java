import java.util.*;

public class StackOfIntegers {
	public static void main(String args[]){
		StackOfIntegers stack1 = new StackOfIntegers();
		StackOfIntegers stack2 = new StackOfIntegers(20);
		for(int i = 0; i < stack1.capicity; i++){
			stack1.push(i);
			
		}
		for(int i =0; i < 20; i++){
			stack2.push(10 + i);
		}
		
		System.out.println(stack1.peek());
		System.out.println(stack2.peek());
		
		stack1.push(100000);
		
		
	}
	
	
	
	
	private int elements[];//�洢ջ������������
	private int size;//ʵ�ʴ洢�����ĸ���
	public static final int capicity = 16;//Ĭ�ϵĲ���ҲҪ��Ϊ���������
	
	StackOfIntegers(){
		this(capicity);//���ﾹȻû��size������
		size = 0;	
    }
	StackOfIntegers(int capicity){
		elements = new int [capicity];
		size = 0;
		
	}
	//����д������ʱ��������Ҫ���Ϸ��ʿ��Ʒ�public
	public boolean empty(){
		if(size == 0)
			return true;
		else 
			return false;
	}
	public int peek(){
		return elements[size - 1];
	}
	public int pop(){
		int temp = elements[size - 1];
		size = size - 1;
		return temp;
	}
	public void push(int value){
		if(size >= elements.length){
			int temp[] = new int[elements.length * 2];
			
			//temp = Arrays.copyOf(elements, elements.length);//�����͸ı���temp�����ã�������Ʒ����ǲ����е�
			System.arraycopy(elements, 0, temp, 0, size);
			elements = temp;
		    elements[size] = value;
		}
		 elements[size++] = value;
		 
	}
	public int getSize(){
		return size;
	}

}
