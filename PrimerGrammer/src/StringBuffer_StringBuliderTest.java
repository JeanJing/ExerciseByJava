//StringBuffer��StringBuilder������lang������
public class StringBuffer_StringBuliderTest {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("zuotianyoumengjianchenleqishiwobuyinggaigeitafaduanxinde");//������������һ��string
		System.out.println(sb.append("jingzhenayn"));
		sb.delete(20, 30);
		System.out.println(sb);
		sb.insert(1, 1.222);
		System.out.println(sb);//���뵽ƫ����λ�ã�ԭ�ȵĲ������������ƶ�
		sb.reverse();
		System.out.println(sb);//StringBuilder�ṩ�ķ���Ҫ��String��һЩ
		sb.setCharAt(0,'N');
		System.out.println(sb);
		sb.replace(0, 4, "chen");
		System.out.println(sb);
		System.out.println("capacity:" + sb.capacity());
		System.out.println("length:" + sb.length());//������ȳ��ȴ�һ��
	    Class cla = StringBuilder.class;
	    
	    System.out.println();
	}

}