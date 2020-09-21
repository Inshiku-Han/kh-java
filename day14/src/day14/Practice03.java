package day14;
//1,5,7을 저장하고 있는 리스트와 2,6,8을 저장하는 리스트 두 개를 만들자. 그 후

//새로운 1,5,7을 저장하고 있는 리스트에 2,6,8의 데이터를 갖고 있는 리스트의 데이터를 복사해보자.

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
