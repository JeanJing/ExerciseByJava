//VM  args: -Xss128k
public class JavaVMStackOF {
	private int stackLength = 1;
	
	public void stackLeak(){//���Ϸ����ĵ��ø÷��������þ��ǲ��ϵ��������ջ��ʹջ֡��ջ���Ǹ�ջ����Ⱦͻ᲻������
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
