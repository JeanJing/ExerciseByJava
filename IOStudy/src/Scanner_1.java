import java.io.File;//file是在io文件里的
import java.io.FileNotFoundException;
import java.util.*;
public class Scanner_1 {
	public static void main(String args[]) throws FileNotFoundException{
		//测试scanner的令牌读取法，next为读令牌，分隔符不读，但是nextLine读分隔符，但是不返回
		//这个分隔符，是我们人工可以通过正规式指定的
		ArrayList<String> array = new ArrayList<String>(20);
		File file = new File("1.txt");
		Scanner sc = new Scanner(file);//文件可能找不到，要有这样的异常声明
		sc.useDelimiter(" |,|//");
		//sc.useDelimiter(" |,|\\\\"); 
		while(sc.hasNext()){
			array.add(sc.next());
			//array.add(sc.nextLine());
		}
		sc.close();
		Iterator iterator = array.iterator();
		while(iterator.hasNext()){
		   System.out.println(iterator.next());
		}
		//扫描控制台输入
		Scanner sc_2 = new Scanner(System.in);//一旦new了就会一直等待控制台输入
		//对从命令行输入不是特别的懂
	    System.out.println("请输入字符串：");
		while(true){
		   String line = sc_2.nextLine();
		   if(line.equals("exit"))
		   //if(line == "exit")//这样竟然判断的是引用是否相同，并不是内容，这是java和c++的不同
			   break;
		   System.out.println(">>>" + line);
	   }
	//返回scanner当前使用的分隔符
	System.out.println(sc_2.delimiter());
	System.out.println(sc.delimiter());
	}
}
