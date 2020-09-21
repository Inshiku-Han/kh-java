package day13;

import java.util.ArrayList;
import java.util.List;

public class Student1Test {
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();

		Student1 stu1 = new Student1();
		stu1.getPerson().setName("java"); // Student1�� �ִ� ���������� ��� �� ���������� �ִ� �޼ҵ带 ����
		stu1.getPerson().setAge(20); // ������ ���� ����
		stu1.getSungjuk().setKorScore(80);
		stu1.getSungjuk().setEngScore(90);
		stu1.getSungjuk().setMathScore(100);
		list.add(stu1); // ���� ������ �������� stu1�� list�� ����

		Student1 stu2 = new Student1();

		stu2.getPerson().setPersonInfo("�ڹ�", 30);
		stu2.getSungjuk().getSungjukInfo(30, 20, 40);
		list.add(stu2);

		Student1 stu3 = new Student1();
		Person person = new Person();
		person.setPersonInfo("���̽�", 10); // person.�޼ҵ�� ���� ����
		stu3.setPerson(person); // stu3.�޼ҵ忡 �������� ����
		Sungjuk sungjuk = new Sungjuk();
		sungjuk.getSungjukInfo(70, 70, 70);
		stu3.setSungjuk(sungjuk);
		list.add(stu3);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getPerson().toString());
			System.out.println(list.get(i).getPerson()); // toString�޼ҵ�� �Է������ʾƵ� Ŭ������ü�� ��½�Ű�� ���빰�� ����Ѵ�.
			System.out.println(list.get(i).getSungjuk());
			System.out.println("���� = " + list.get(i).getSungjuk().getTotalScore());
			System.out.println("��� = " + list.get(i).getSungjuk().getAvg() + "\n");
		}

		// ���������� 60�� �̻��� �л����� �̸��� ���������� ���
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSungjuk().getMathScore() >= 60) {
				System.out.println("�̸� = " + list.get(i).getPerson().getName() + " / " + "�������� = " + list.get(i).getSungjuk().getMathScore());
			}
		}
	}
}
