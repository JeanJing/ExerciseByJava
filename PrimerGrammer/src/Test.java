import java.util.Date;


public class Test {
	public static void main(String args[]){
		System.out.println('\u0000');//char���͵�Ĭ��ֵ�ǿհ׷�
		Date d = new Date();
		System.out.println(d.getTime()/1000/60/60/24/365);//���˵�����ʱ���Ǵ�1970�꿪ʼ�����
		//Math m = new Math();//��ΪMath����ȫ��static�����ͷ���������û�б�Ҫ����Math��ʵ������������Լ��Ĺ��췽������Ϊprivate
	    System.out.printf("%30s%15s\n", "Radius", "Area");//��������printf���������ʽ
	    Object o = new Object();
	    //��Ҳ��ΪʲôJava֮ǰ�Ҿ����ر�ǿ�󣬿���������е�����
	    System.out.println(o);//toString����+@+ʮ�������ڴ��ַ
	    
	    System.out.println(Integer.MAX_VALUE);
	}
}
