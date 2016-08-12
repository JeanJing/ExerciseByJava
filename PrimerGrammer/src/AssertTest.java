
public class AssertTest {
	public static void main(String args[]){
		int m;
		try{
		   m =test(-10);
		}catch(Error e){
			System.out.println("输入字符不满足条件："+e.getMessage());
		}
	
		System.out.println("输出结果");
	}
	public static  int test(int x){
		assert x > 0 : x;
		return x;
	}

}
