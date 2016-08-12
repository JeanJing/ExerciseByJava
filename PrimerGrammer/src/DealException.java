import java.io.*;
import java.util.*;

public class DealException {              //声明异常起码可以通过编译，但是方法并没有对异常有实质性的处理
	public static void main(String args[]){//学习抛出异常，没有看到我想要的结果
		                                  //这里是声明异常
//	int a  = 1 / 0;
//	System.out.println("是这样的吗");
		int a = 1;
		int b = 0;
//除数为0的算术异常
/*************
  		try{
		   if(b == 0)
			   //如果后面没有相应的catch捕获这个异常，那么程序还会异常结束
			   throw new ArithmeticException("除数不能为0");//手动抛出异常
		   int m = a / b;//自动抛出异常
		   System.out.println("xiaojin hao kenai");//异常抛出正常的执行流被中断
		   File f = new File("jing.txt");
		   FileInputStream i = new FileInputStream(f);//是这些流会产生IOException
		}
		catch(IOException ex){
			System.out.println("除以了0");
		}
*************/
//输入不匹配异常
/*****************
		Scanner sc = new Scanner(System.in);
		try{
			int data = sc.nextInt();
		}
		catch(InputMismatchException ex){
			System.out.println("输入的不是整数");
		}
*******************/
		Scanner sc;
		try {
			sc = new Scanner(new File("jingzhenyan.txt"));//因为Scanner的构造函数里抛出了这个异常
			System.out.println(sc.next()+"到底行不行呀");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			// TODO Auto-generated catch block
			e.printStackTrace();//这个部分就会输出我们平时看到的红体字的部分
			
			//printStackTrace()可以在控制台上输出栈跟踪信息
			//即使你不明确调用这个方法，它也会显示出来的
		//	System.out.println("jingzhenyan");
		}//但是为什么这里没有抛出异常
		//这里根本就没有字符所以无法输出
		//}catch(FileNotFoundException e){//子类异常不可以出现在父类异常的后面，因为，父类异常可以捕获到子类异常，它已经把该异常处理过了，就不会再到子类异常处理这里，这是没有意义的
			
		//}
		
		
	}

}
