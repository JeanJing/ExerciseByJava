import java.io.*;
public class DataInputStream_DataOutputStream {
	public static void main(String args[]) throws IOException{
		DataOutputStream out = new DataOutputStream(new FileOutputStream("3.txt"));
		String str = "景祯彦";
		out.writeUTF(str);
		out.close();
		DataInputStream in = new DataInputStream(new FileInputStream("3.txt"));//这个流是基于过滤流的所以必须以某流为借口
	    System.out.println(in.readUTF());
	    
		in.close();
	}
}
  