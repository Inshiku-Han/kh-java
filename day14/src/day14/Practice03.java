package day14;
//1,5,7�� �����ϰ� �ִ� ����Ʈ�� 2,6,8�� �����ϴ� ����Ʈ �� ���� ������. �� ��

//���ο� 1,5,7�� �����ϰ� �ִ� ����Ʈ�� 2,6,8�� �����͸� ���� �ִ� ����Ʈ�� �����͸� �����غ���.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice03 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(5);
		list1.add(7);
		list2.add(2);
		list2.add(6);
		list2.add(8);

//		for (int i = 0; i < list2.size(); i++) {
//			list1.add(list2.get(i));
//		}
		
		list1.addAll(list2);
		Iterator<Integer> ite = list1.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			System.out.print(num + " ");
		}
	}

}
