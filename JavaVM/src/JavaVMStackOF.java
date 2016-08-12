//VM  args: -Xss128k
public class JavaVMStackOF {
	private int stackLength = 1;
	
	public void stackLeak(){//不断反复的调用该方法，作用就是不断底在虚拟机栈里使栈帧进栈，那个栈的深度就会不断增加
		stackLength++;
		stackLeak();
	}
	public static void main(String[] args) throws Throwable{ 
		JavaVMStackOF oom = new JavaVMStackOF();
		try{
			oom.stackLeak();
			
		}catch(Throwable e){
			System.out.println("stack length:" + oom.stackLength);
		}
	}

}
