package ClassLoaderTest;

import java.util.*;

public class Test {

	public static void main(String args[]){
		ClassLoader loader = Test.class.getClassLoader();
		System.out.println(loader.toString());
		//loader = String.class.getClassLoader();//基本类是没有加器的吗
		//System.out.println(loader.toString());
		//loader = Object.class.getClassLoader();
		//System.out.println(loader.toString());
		loader = jing.class.getClassLoader();
		System.out.println(loader.toString());
		
		
		loader = zhen.class.getClassLoader();
		System.out.println(loader.getResource(""));
		
	}
class zhen{}
}
class jing{}
