import java.io.*;
public class DataInputStream_DataOutputStream {
	public static void main(String args[]) throws IOException{
		DataOutputStream out = new DataOutputStream(new FileOutputStream("3.txt"));
		String str = "������";
		out.writeUTF(str);
		out.close();
		DataInputStream in = new DataInputStream(new FileInputStream("3.txt"));//������ǻ��ڹ����������Ա�����ĳ��Ϊ���
	    System.out.println(in.readUTF());
	    
		in.close();
	}
}
  