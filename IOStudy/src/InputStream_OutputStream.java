import java.io.*;

/***
 * **
 * @author celin
 * 学会字节流中read(byte[] data)是将流中读到的字节序列放到data中
 */
public class InputStream_OutputStream {
	public static void main(String args[]) throws IOException{
		//小的文件，字节流一次性读到一个byte数组里
		FileInputStream in = new FileInputStream("1MB");
	    int byteAvailiable = in.available();
	    byte[] data = new byte[byteAvailiable];
	    if(byteAvailiable > 0){
	    	 
	    	System.out.println("实际读入字节个数为：" + in.read(data));
	    }
	    in.reset();//filestream是不支持重置流，它是顺序读写
	    System.out.println(in.read());
	    in.close();
	    FileOutputStream out = new FileOutputStream("1MB_copy");
	    out.write(data);
		out.close();
	}
}
