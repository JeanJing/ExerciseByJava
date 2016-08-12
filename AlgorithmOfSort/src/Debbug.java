public class Debbug {
	public static void main(String args[]) {
		/**************
		 *测试自己写的归并排序 
		 *************/
		
		int a[] = { 2, 1, 3, 2, 7, 6, 3, 2, 6, 131, 34, 314, 1, 34, 5, 13, 41,
				23, 3, 3, -45545, -56, -23421, 1, 431, 4, 3, 1, 423, 543, 5,
				234, 5234, 5, 13413, 4123, 41, 2341, 441, 2, 34, 1, 23, 41,
				2341, 234, 1 };
		MergeSort mSort = new MergeSort();
		mSort.sort(a, 0, a.length - 1);
		for (int n : a) {
			System.out.println(n);
		}
		
		
		
	}

}


