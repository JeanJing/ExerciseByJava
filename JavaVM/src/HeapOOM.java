import java.util.*;

// VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
public class HeapOOM {
	static class OOMObject{
		
	}
	public static void main(String []args){
		List<OOMObject> list = new ArrayList();
		int i = 0;
		
		while(true){
			list.add( new OOMObject());
			//System.out.println(++i);
		}
	}

}
