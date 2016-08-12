import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;


public class Test {
	public static void main(String args[]) throws FileNotFoundException{
		int count[] = new int[10];
		Random rand = new Random(System.currentTimeMillis());//随机类是在util库里面的
		for(int i = 0; i < 100; i++){
			
			count[rand.nextInt(10)]++;
		}
		for(int n :count)
			System.out.println(n);
		System.out.println(Math.random());//返回的是double值
		
		int copy_shallow[];
		copy_shallow = count;//这个是浅拷贝，只是声明了一个数组引用，然后让它指向已分配好的内存
		System.out.println("数组浅拷贝");
		for(int i = 0; i < 10; i++){
			System.out.println(copy_shallow[i]);
		}
		System.out.println("数组深度拷贝");//两个在内存中的不同位置，将一个的内容拷贝到另一中
		int copy_deep[];
		copy_deep = count.clone();
		if(copy_deep != count)
			System.out.println("在内存中又申请空间，将原先的内容复制到申请的内存中");
		if(copy_shallow == count)
			System.out.println("这种是浅拷贝，只是换了引用");
		int copy_deep_system_arraycopy[] = new int[20];
		System.arraycopy(count, 3, copy_deep_system_arraycopy, 10, 3);
		for(int i = 0; i < copy_deep_system_arraycopy.length; i++){
			System.out.println(copy_deep_system_arraycopy[i]);
		}
		PrintWriter pw = new PrintWriter("jing.txt");
		//结果是确实将之前的内容覆盖了
		pw.write("jingzhenyanyangfanwohenni wojuebuhui yaujliangni ");//print("in fact, i don't love chen deeply,i just can't forget the dream i make.");
		pw.close();//看来这个必须close不然文件流就会出错
		
	}

}
