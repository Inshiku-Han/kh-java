package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam01 {
public static void main(String[] args) {
	//HashSet
	//Ctrl + Shift + O : �ʿ��� import �ڵ� ȣ��
	Set<String>	set = new HashSet<>();
	
	set.add("Toy");
	set.add("Box");
	set.add("Robot");
	set.add("Robot"); // �ߺ��� �ȵ�
	set.remove("Box"); // ������ƮŸ�Ը� �Է°���. string�̳� Ŭ���� ��
	
	System.out.println("����� �������� �� :" + set.size());
	System.out.println();
	for(String e : set) { // �Ϲ� for�����δ� ��� �Ұ�. Set���� ������ ������ ����
		System.out.println(e); // �������� ����� ���� ���
	}
	System.out.println();
	
	Iterator<String> ite = set.iterator();
	while(ite.hasNext()) {
		String s = ite.next();
		System.out.println(s);
	}
}
}
