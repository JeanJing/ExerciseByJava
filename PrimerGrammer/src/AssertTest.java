
public class AssertTest {
	public static void main(String args[]){
		int m;
		try{
		   m =test(-10);
		}catch(Error e){
			System.out.println("�����ַ�������������"+e.getMessage());
		}
	
		System.out.println("������");
	}
	public static  int test(int x){
		assert x > 0 : x;
		return x;
	}

}
