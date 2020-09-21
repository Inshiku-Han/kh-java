package day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//	ArrayList<String> list = new ArrayList<>(); // 리스트 내 자료형은 한 종류만 가능. 생성자측 부호는 공백
		List<String> list = new ArrayList<>(); // util에 있는 인터페이스로도 생성 가능. 주로 이것을 사용
		list.add("Toy"); // 넣는 순서대로 대입. 0번째
		list.add("Box"); // 1
		list.add("Robot"); // 2
		list.add("Robot"); // 3
		System.out.println(list.get(0)); // 호출
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println();
		list.remove(0); // 삭제 기능. 삭제한 후 뒤에 있는 자료들이 앞당겨진다. 배열 특징
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
			
			
			
			List<Integer> list1 = new LinkedList<>(); // 링크드도 방법이 같다.
			
			list1.add(5);
			list1.add(3);
			list1.add(4);
			System.out.println();
			for(int e : list1) {
				System.out.println(e);
			}
			
		}
	}
}
