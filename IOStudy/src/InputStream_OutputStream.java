import java.io.*;

/***
 * **
 * @author celin
 * ѧ���ֽ�����read(byte[] data)�ǽ����ж������ֽ����зŵ�data��
 */
public class InputStream_OutputStream {
	public static void main(String args[]) throws IOException{
		//С���ļ����ֽ���һ���Զ���һ��byte������
		FileInputStream in = new FileInputStream("1MB");
	    int byteAvailiable = in.available();
	    byte[] data = new byte[byteAvailiable];
	    if(byteAvailiable > 0){
	    	 
	    	System.out.println("ʵ�ʶ����ֽڸ���Ϊ��" + in.read(data));
	    }
	    in.reset();//filestream�ǲ�֧��������������˳���д
	    System.out.println(in.read());
	    in.close();
	    FileOutputStream out = new FileOutputStream("1MB_copy");
	    out.write(data);
		out.close();
	}
}
