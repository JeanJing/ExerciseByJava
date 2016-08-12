
public class MemoryAllocation {
	private static final int _1MB = 1024 * 1024;
	public static void main(){
		//testAlloctiaon();
		testPertenureSizeThreadhold();
	}
	public static void testAlloctiaon(){
		byte[] alloction1, alloction2, alloction3, alloction4;
		alloction1 = new byte[2*_1MB];
		alloction2 = new byte[2*_1MB];
		alloction3 = new byte[2*_1MB];
		alloction4 = new byte[4*_1MB];
	}
	public static void testPertenureSizeThreadhold(){
		byte[] allocation;
		allocation = new byte[4 * _1MB];
	}

}
