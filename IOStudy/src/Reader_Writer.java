import java.io.*;
public class Reader_Writer {
	public static void main(String args[]) throws IOException{
		CharSequence ch;
		ch ="景";
		System.out.println(ch);
	    FileInputStream file = new FileInputStream("中文文本.txt");
		InputStreamReader in = new InputStreamReader(file, "UTF-8");
		int str;
		System.out.println(System.getProperty("user.dir"));
		//in.
	//	while((str = ()) != -1)
	//		System.out.println(str);
		
	}
}
