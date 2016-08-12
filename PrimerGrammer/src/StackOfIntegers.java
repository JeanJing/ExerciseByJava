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
	
	
	
	
	private int elements[];//存储栈中整数的数组
	private int size;//实际存储整数的个数
	public static final int capicity = 16;//默认的参数也要作为类的数据域
	
	StackOfIntegers(){
		this(capicity);//这里竟然没有size的设置
		size = 0;	
    }
	StackOfIntegers(int capicity){
		elements = new int [capicity];
		size = 0;
		
	}
	//我在写函数的时候忘记了要加上访问控制符public
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
			
			//temp = Arrays.copyOf(elements, elements.length);//这样就改变了temp的引用，这个复制方法是不可行的
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
