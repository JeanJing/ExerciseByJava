package Alorithm;

import java.util.*;

//���ֲ����������
public class Test {
	public static void main(String args[]) {
		ArrayList<String> array = new ArrayList();
		if (array instanceof RandomAccess)
			System.out.println("ArrayList is RandomAccess");
		// sort�����ַ�������ͨ��ָ���Ƚ���������collections�ķ���Ƚ���
		// sort�����Ƚ�����ת��Ϊ���飬�鲢������壬�ٽ�������Ƶ��б�
		Integer[] num = { 2, 1, 4, 5, 3, 52, 4, 525, 254 };
		num[0] = 20;
		// Collections.sort(Arrays.asList(num));//sort���list�ӿ�
		Collections.sort(Arrays.asList(num), Collections.reverseOrder());// ��������comparebaleTo���෴�Ƚ���
		for (Integer n : num) {
			System.out.println(n);
		}

		List<Integer> list = new LinkedList<>(Arrays.asList(num));
		Collections.sort(list);
		System.out.println(list);

		// binarysearch ����ֵ��ʾ��ʶ�еĵڼ���Ԫ�� >= 0 �ҵ�λ�� <0 -i-1 ����λ��
		// �������������Ļ����Զ�ת��Ϊ���Բ���
		ArrayList<Integer> arraylist = new ArrayList<Integer>(list);
		int i = Collections.binarySearch(list, -1);
		if (i >= 0)
			System.out.println("find it: " + i);
		else
			System.out.println("no find it, �����λ��Ϊ��" + (-i - 1));

		// addAll
		Collections.addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);

	}
}
