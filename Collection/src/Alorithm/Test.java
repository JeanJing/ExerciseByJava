package Alorithm;

import java.util.*;

//二分查找针对数组
public class Test {
	public static void main(String args[]) {
		ArrayList<String> array = new ArrayList();
		if (array instanceof RandomAccess)
			System.out.println("ArrayList is RandomAccess");
		// sort有两种方法，普通和指定比较器，还有collections的反序比较器
		// sort方法先将链表转化为数组，归并排序变体，再将结果复制到列表
		Integer[] num = { 2, 1, 4, 5, 3, 52, 4, 525, 254 };
		num[0] = 20;
		// Collections.sort(Arrays.asList(num));//sort针对list接口
		Collections.sort(Arrays.asList(num), Collections.reverseOrder());// 返回类型comparebaleTo的相反比较器
		for (Integer n : num) {
			System.out.println(n);
		}

		List<Integer> list = new LinkedList<>(Arrays.asList(num));
		Collections.sort(list);
		System.out.println(list);

		// binarysearch 返回值表示常识中的第几个元素 >= 0 找到位置 <0 -i-1 插入位置
		// 如果给的是链表的话，自动转化为线性查找
		ArrayList<Integer> arraylist = new ArrayList<Integer>(list);
		int i = Collections.binarySearch(list, -1);
		if (i >= 0)
			System.out.println("find it: " + i);
		else
			System.out.println("no find it, 插入的位置为：" + (-i - 1));

		// addAll
		Collections.addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);

	}
}
