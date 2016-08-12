
public class ParaOfJAVAMemory {
	public static void main(String args[]){
		new ParaOfJAVAMemory().doTest();
	}

	private  void doTest(){
		Integer M = new Integer(1024*1024*1);
	    byte[] obj = new byte[1*M];
	    obj = null;
	    System.gc();
	    System.out.println();
	    
	    obj = new byte[1*M];
	    obj = new byte[1*M];
		//obj = null;
		System.gc();
		System.out.println();
	}

}
