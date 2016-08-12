import java.util.Date;


public class Test {
	public static void main(String args[]){
		System.out.println('\u0000');//char类型的默认值是空白符
		Date d = new Date();
		System.out.println(d.getTime()/1000/60/60/24/365);//充分说明这个时间是从1970年开始算起的
		//Math m = new Math();//因为Math里面全是static变量和方法，所以没有必要创建Math的实例，因此它把自己的构造方法定义为private
	    System.out.printf("%30s%15s\n", "Radius", "Area");//可以利用printf控制输出格式
	    Object o = new Object();
	    //这也是为什么Java之前我觉得特别强大，可以输出所有的类型
	    System.out.println(o);//toString类名+@+十六进制内存地址
	    
	    System.out.println(Integer.MAX_VALUE);
	}
}
