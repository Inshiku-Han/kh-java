package day14;

import java.util.Set;
import java.util.TreeSet;

public class Exam02 {
public static void main(String[] args) {
	//TreeSet
	Set<Integer> set = new TreeSet<Integer>();
	// set ������ ���ؼ� ũ�⿡ ���� ������������ ����
	set.add(3);
	set.add(1);
	set.add(2);
	set.add(4);
	set.add(4); // �ߺ� ��� x
	
	System.out.println("������ �� : " + set.size());
	System.out.println();
	
	for(int e : set) {
		System.out.println(e + " ");
		}
	}
}
