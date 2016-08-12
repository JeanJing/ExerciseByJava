import java.io.*;
//http://blog.csdn.net/wuwenxiang91322/article/details/8042725
public class BufferedStream {
	public static void main(String args[]) throws IOException{
		FileInputStream file = new FileInputStream("1MB");
		//ͨ�����ٶ�д����������������
		BufferedInputStream in = new BufferedInputStream(file);
		byte ch;
		int count_b=0;
		long start_b = System.currentTimeMillis();
		while((ch =  (byte) in.read()) != -1)//���ÿ��Ӧ�ö�ֻ��һ���ֽ�
			count_b++;
		
		in.close();
		file.close();
		long end_b = System.currentTimeMillis();
		
		FileInputStream file_2 = new FileInputStream("1MB");
		DataInputStream in_d = new DataInputStream(file_2);
		int count_d=0;
		long start_d = System.currentTimeMillis();;
		while((ch = (byte) in_d.read()) !=   -1)//���ÿ��Ӧ�ö�ֻ��һ���ֽ�
			count_d++;
		in.close();
		
		file_2.close();
		long end_d = System.currentTimeMillis();
		System.out.println("buffer�����ֽڸ����ǣ�" + count_b + "�õ�ʱ���ǣ�" + (end_b - start_b) / 1000);
		System.out.println("buffer�����ֽڸ����ǣ�" + count_d + "�õ�ʱ���ǣ�" + (end_d - start_d) / 1000);
		
	}
}
