import java.io.File;//file����io�ļ����
import java.io.FileNotFoundException;
import java.util.*;
public class Scanner_1 {
	public static void main(String args[]) throws FileNotFoundException{
		//����scanner�����ƶ�ȡ����nextΪ�����ƣ��ָ�������������nextLine���ָ��������ǲ�����
		//����ָ������������˹�����ͨ������ʽָ����
		ArrayList<String> array = new ArrayList<String>(20);
		File file = new File("1.txt");
		Scanner sc = new Scanner(file);//�ļ������Ҳ�����Ҫ���������쳣����
		sc.useDelimiter(" |,|//");
		//sc.useDelimiter(" |,|\\\\"); 
		while(sc.hasNext()){
			array.add(sc.next());
			//array.add(sc.nextLine());
		}
		sc.close();
		Iterator iterator = array.iterator();
		while(iterator.hasNext()){
		   System.out.println(iterator.next());
		}
		//ɨ�����̨����
		Scanner sc_2 = new Scanner(System.in);//һ��new�˾ͻ�һֱ�ȴ�����̨����
		//�Դ����������벻���ر�Ķ�
	    System.out.println("�������ַ�����");
		while(true){
		   String line = sc_2.nextLine();
		   if(line.equals("exit"))
		   //if(line == "exit")//������Ȼ�жϵ��������Ƿ���ͬ�����������ݣ�����java��c++�Ĳ�ͬ
			   break;
		   System.out.println(">>>" + line);
	   }
	//����scanner��ǰʹ�õķָ���
	System.out.println(sc_2.delimiter());
	System.out.println(sc.delimiter());
	}
}
