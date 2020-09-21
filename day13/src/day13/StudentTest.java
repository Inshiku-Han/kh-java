package day13;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>(); // ��ü�� �÷��� �����ӿ�ũ

		Student st1 = new Student();

		list.add(st1); // null 0 null

		Student st2 = new Student();
		st2.setName("�ڹ�");
		st2.setAge(20);
		st2.setGrade("A");
		list.add(st2);

		Student st3 = new Student();
		st3.setStudentInfo("C++", 30, "B");
		list.add(st3);

//		 �������� �� �л��� ������ ���
		for (int i = 0; i < list.size(); i++) {
			list.get(i).displayStudentInfo(); //Ŭ����.�޼ҵ�
			System.out.println();
		}
		System.out.println();
		
		for(Student e: list) { // ��ȭfor�� Ŭ���� ����Ҷ��� ���������� ���   Student e = list �� ����
			e.displayStudentInfo(); // Ŭ����e.�޼ҵ�
			System.out.println();
		}
		
		System.out.println();
		
		//list�� �� ��� �л��� �̸��� ���
		for(Student e : list) {
			System.out.print(e.getName() + " ");
		}
		
		System.out.println("\n");
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i).getName() + " ");
		}
		System.out.println("\n");
		
		//list�� �� ��� �л��� ���� ���� ���
		int sum = 0;
		for(Student e : list) {
			sum += e.getAge();
			
		}
		System.out.println(sum);
		System.out.println();
		
		int sum1 = 0;
		for(int i = 0 ; i < list.size(); i++) {
			sum1 += list.get(i).getAge();
		}
		System.out.println(sum1);
	}
}
