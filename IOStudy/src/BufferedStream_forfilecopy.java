import java.io.*;
import java.util.Scanner;
public class BufferedStream_forfilecopy {
	/***
	 * 该程序比较了buffer和普通字节流的读取效率
	 * 
	 */
	public static void main(String args[]) throws IOException{
		String fileName1; 
		String fileName2;
		Scanner in = new Scanner(System.in);
		System.out.println("输入源文件名和目标文件名:");
		fileName1 = in.next();
		fileName2 = in.next();
		long startTime = System.currentTimeMillis();
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName1));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(fileName2));
		int cc, numbersOfBytesCopied_1 =0;
		while((cc = bi.read()) != -1){//按基本的字节流处理只是简单的应用到缓冲的性质
			bo.write((byte)cc);
			numbersOfBytesCopied_1++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("1复制文件的字节数是：" + numbersOfBytesCopied_1);
		System.out.println("1复制文件所需毫秒数为：" + (endTime - startTime));
		
		long startTime_2 = System.currentTimeMillis();
		FileInputStream fi = new FileInputStream(fileName1);
		FileOutputStream fo = new FileOutputStream("2.txt");
		int bb, numbersOfBytesCopied_2 =0;
		while((bb = fi.read()) != -1){//按基本的字节流处理只是简单的应用到缓冲的性质
			fo.write((byte)bb);
			numbersOfBytesCopied_2++;
		}
		long endTime_2 = System.currentTimeMillis();
		System.out.println("2复制文件的字节数是：" + numbersOfBytesCopied_2);
		System.out.println("2复制文件所需毫秒数为：" + (endTime_2 - startTime_2));
		fi.close();
		fo.close();
		//由时间结果可以看到在处理大文件时，BufferedInputStream要比FileInputStream处理文件快将近两个数量级
	}
}
