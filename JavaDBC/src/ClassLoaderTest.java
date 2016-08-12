
public class ClassLoaderTest {
	public static void main(String args[]){
		ClassLoader loader = ClassLoaderTest.class.getClassLoader();
		//System.out.println(loader.toString());
		while(loader!= null){
			System.out.println(loader.toString());
			loader =  loader.getParent();
		}
	}

}
