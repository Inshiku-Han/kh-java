package day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//	ArrayList<String> list = new ArrayList<>(); // ����Ʈ �� �ڷ����� �� ������ ����. �������� ��ȣ�� ����
		List<String> list = new ArrayList<>(); // util�� �ִ� �������̽��ε� ���� ����. �ַ� �̰��� ���
		list.add("Toy"); // �ִ� ������� ����. 0��°
		list.add("Box"); // 1
		list.add("Robot"); // 2
		list.add("Robot"); // 3
		System.out.println(list.get(0)); // ȣ��
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println();
		list.remove(0); // ���� ���. ������ �� �ڿ� �ִ� �ڷ���� �մ������. �迭 Ư¡
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
			
			
			
			List<Integer> list1 = new LinkedList<>(); // ��ũ�嵵 ����� ����.
			
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
