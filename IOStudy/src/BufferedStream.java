import java.io.*;
//http://blog.csdn.net/wuwenxiang91322/article/details/8042725
public class BufferedStream {
	public static void main(String args[]) throws IOException{
		FileInputStream file = new FileInputStream("1MB");
		//通过减少读写次数来提高输入输出
		BufferedInputStream in = new BufferedInputStream(file);
		byte ch;
		int count_b=0;
		long start_b = System.currentTimeMillis();
		while((ch =  (byte) in.read()) != -1)//这个每次应该都只读一个字节
			count_b++;
		
		in.close();
		file.close();
		long end_b = System.currentTimeMillis();
		
		FileInputStream file_2 = new FileInputStream("1MB");
		DataInputStream in_d = new DataInputStream(file_2);
		int count_d=0;
		long start_d = System.currentTimeMillis();;
		while((ch = (byte) in_d.read()) !=   -1)//这个每次应该都只读一个字节
			count_d++;
		in.close();
		
		file_2.close();
		long end_d = System.currentTimeMillis();
		System.out.println("buffer读的字节个数是：" + count_b + "用的时间是：" + (end_b - start_b) / 1000);
		System.out.println("buffer读的字节个数是：" + count_d + "用的时间是：" + (end_d - start_d) / 1000);
		
	}
}
