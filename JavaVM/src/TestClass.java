import java.io.*;


public class TestClass {
	
	private int m;
	public int inc(){
		return  m + 1;
	}
	public void test() throws FileNotFoundException{
		File file = new File("jing.txt");
		FileInputStream ou = new FileInputStream(file);
	}

}
