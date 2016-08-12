
public class StaticTest_javaProgramLoad {
	public static void main(String[] args) {
		new StaticTest("init");
	}
}
class StaticTest {
	public static int k=0;
	public static StaticTest s1=new StaticTest("s1");
	public static StaticTest s2=new StaticTest("s2");
	public static int i=print("i");
	public static int n=99;
	public int j=print("j");
	
	{
		print("¹¹Ôì¿é");
	}
	
	static
	{
		print("¾²Ì¬¿é");
	}
	
	public static int print(String s)
	{
		System.out.println(++k+":"+s+"\ti="+i+"\tn="+n);
		++n;
		return ++i;
	}
	
	public StaticTest(String s)
	{
		System.out.println(++k+":"+s+"\ti="+i+"\tn="+n);
		++i;
		++n;
	}

	
}