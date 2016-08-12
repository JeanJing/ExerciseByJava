import java.io.*;
import java.util.Scanner;
public class BufferedStream_forfilecopy {
	/***
	 * �ó���Ƚ���buffer����ͨ�ֽ����Ķ�ȡЧ��
	 * 
	 */
	public static void main(String args[]) throws IOException{
		String fileName1; 
		String fileName2;
		Scanner in = new Scanner(System.in);
		System.out.println("����Դ�ļ�����Ŀ���ļ���:");
		fileName1 = in.next();
		fileName2 = in.next();
		long startTime = System.currentTimeMillis();
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName1));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(fileName2));
		int cc, numbersOfBytesCopied_1 =0;
		while((cc = bi.read()) != -1){//���������ֽ�������ֻ�Ǽ򵥵�Ӧ�õ����������
			bo.write((byte)cc);
			numbersOfBytesCopied_1++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("1�����ļ����ֽ����ǣ�" + numbersOfBytesCopied_1);
		System.out.println("1�����ļ����������Ϊ��" + (endTime - startTime));
		
		long startTime_2 = System.currentTimeMillis();
		FileInputStream fi = new FileInputStream(fileName1);
		FileOutputStream fo = new FileOutputStream("2.txt");
		int bb, numbersOfBytesCopied_2 =0;
		while((bb = fi.read()) != -1){//���������ֽ�������ֻ�Ǽ򵥵�Ӧ�õ����������
			fo.write((byte)bb);
			numbersOfBytesCopied_2++;
		}
		long endTime_2 = System.currentTimeMillis();
		System.out.println("2�����ļ����ֽ����ǣ�" + numbersOfBytesCopied_2);
		System.out.println("2�����ļ����������Ϊ��" + (endTime_2 - startTime_2));
		fi.close();
		fo.close();
		//��ʱ�������Կ����ڴ�����ļ�ʱ��BufferedInputStreamҪ��FileInputStream�����ļ��콫������������
	}
}
