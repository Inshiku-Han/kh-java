package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam05 {
public static void main(String[] args) {
	//Map<K,V>
	//key - value �������� ������ �̷���� ����. ������ȣ, �ڷ��� ����
	Map<Integer, String> map = new HashMap<>();
	
	
	
	//������ ����
	map.put(45, "Brown");
	map.put(37, "James");
	map.put(23, "Martin");
	map.put(23, "Mart");
	
	
	//������ �˻�
//	System.out.println(map.get(45)); //map.get(K) - value���� ���
//	map.remove(37);
//	System.out.println(map.get(37)); // ����� null�� �ʱ�ȭ
//	System.out.println(map.get(23)); // key�� ������ value�� �ٸ� ��� ���������� ����� ������ ���
	
	//Map�� �÷����� �������̽��� �ް� ���� �ʾƼ� ��ü ��¹���� �޸��Ѵ�.
	
	//key�� ��� �ִ� �÷��� �ν��Ͻ� ����
	Set<Integer> ks = map.keySet(); //value���� key��
	
	
	//��ü key�� ���
	for(int e : ks) {
		System.out.println(e);
	}
	System.out.println();
	//��ü value�� ���
	for(int e : ks) {
		System.out.println(map.get(e));
	}
	System.out.println();
	
	//iterator�� key�� value�� ���ÿ� ���
	Iterator<Integer> ite = ks.iterator();
	while(ite.hasNext()) {
		int num = ite.next(); //�⺻�ڷ����� �־�����Ѵ�. �ȱ׷��� ��°������� key�� value�� ��ġ���� �ʴ´�.
		System.out.println("key = " + num);
		System.out.println("value = " + map.get(num));
	}
}
}
