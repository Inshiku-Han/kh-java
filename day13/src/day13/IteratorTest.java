package day13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
public static void main(String[] args) {
	List<String> list = new LinkedList<>();
	list.add("�ڹ�");
	list.add("���ܻ�");
	list.add("���̽�");
	
	//�ݺ��� Iterator
	Iterator<String> ite = list.iterator();
	while(ite.hasNext()) { // ���� �����Ͱ� �ִ°�?
		String s = ite.next();
		System.out.println(s);
		ite.remove(); // �� ����. �� �Ⱦ�
	}
}
}
