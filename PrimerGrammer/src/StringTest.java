
public class StringTest {
	public static void main(String args[]){
		//���string�����ǲ��ɱ䣬ͨ����ֵ���������
		/**************
		 * String str1 = "Jing is a good girl.";
		 * String str2 = "Jing is a good girl.";
		 * String str3 = new String("Jing is a good girl.");
		 * System.out.println(str1 == str2);//str�����ã��е���ָ��
	     * System.out.println(str1 == str3);
		 */
		String str = "Jing is a good girl.           She is very pretty and kind. ";
		String start = "jing";
		String end = "girl";
		System.out.println(str.charAt(1));
		System.out.println(str.endsWith(end));
		System.out.println(str.startsWith(start));
		System.out.println(str.concat("hello"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,7));
		
		//�ַ�����ת��
		System.out.println(str.toUpperCase());//ת��Ϊ��д��ĸ
		System.out.println(str.toLowerCase());//ת��ΪСд��ĸ
		
		System.out.println(str.trim());//trim ȥ���ַ���ǰ��Ŀհ׷�
		//�ַ������滻
		System.out.println(str.replace('r', ' '));
		System.out.println(str.replaceAll("is", "are"));
		System.out.println(str.replaceFirst("is", "are"));
		 
		//�ַ����ķָ�
		String []str_new = str.split("is");//splitӦ����ģʽ�����ֲ�̫��
		for(int i = 0; i < str_new.length; i++){
			System.out.println(str_new[i]);//����ָ�������is���ַ�����Ϊ������
		}
        // ��Ҫ������˵����	
		// �ַ�����ƥ�䣬�滻���ͷָ�ͳͳ������������ʽ��ʾ
		//  �ַ�����ƥ�䣬�滻���ͷָ�ͳͳ������������ʽ��ʾ
		// �ַ�����ƥ�䣬�滻���ͷָ�ͳͳ������������ʽ��ʾ
		
		
		//�������ַ�����ĳ���ַ����ַ���������ֵ
		System.out.println(str.indexOf("very", 18));
		System.out.println(str.lastIndexOf("very",45));//lastValueOf �����һ���ַ���ʼ�ĵ�һ���ַ���λ��
		
		//�ַ���������֮���ת��
		
		//���ַ���ת��Ϊ����
		char chars_new[] = str.toCharArray();
		for(int i = 0; i < chars_new.length; i++){
			System.out.print(chars_new[i]);
		}
		System.out.println();
		//������ת��Ϊ�ַ���
		String str_new1 = String.valueOf(new char[]{'i','c','a','n'});
		System.out.println(str_new1);
		//���ַ�����ֵת��Ϊ�ַ���
		//���õĶ���String.valueOf()
		String str_2 = String.valueOf('E');
		System.out.println(str_2);
		
		//��ʽ��һ���ַ���
		
		System.out.println(String.format("%5.2f", 45.536563465345));
	}

}
