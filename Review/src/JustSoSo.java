import java.util.Arrays;
import java.util.Random;

public class JustSoSo {
	public static void main(String args[]) {
		int data[] = new int[100];// �����Ͷ�������
		// Random a = new Random();//��ȷrandom������util�������
		int a[] = { 1, 2, 3, 4 };
		int b[] = new int[12];
        
		//System.arraycopy(a, 0, b, 0, 3);
		//a = b.clone();
		if(a == b)
			System.out.println(true);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		b = Arrays.copyOfRange(a, 0, 1);// 
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.arraycopy(a,1,data,1,3);//arraycopy��Ψһһ�����᷵��һ��ԭ���鸱����һ�����Ʒ�����Ԫ���Ǵ洢��c����������ڴ����
		for(int each: data){
			System.out.print(each +" ");
		}
		
	}
} 
