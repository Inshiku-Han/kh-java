package manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {
	Scanner sc = new Scanner(System.in);
	private List<Student0> studentList;

	public StudentManage() {
		studentList = new ArrayList<>();

	}

	public void regStudent() {
		System.out.println("�л� ����� �����մϴ�. �л� ������ �Է��ϼ���");
		System.out.println("�̸� = ");
		String name = sc.nextLine();
		System.out.println("���� = ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("����ó = ");
		String adress = sc.nextLine();
		System.out.println("���� = ");
		String grade = sc.nextLine();
		Student0 student = new Student0(name, age, grade, adress);

		studentList.add(student);

	}

	public void changeTellNumber() {

		System.out.println("�л��� ����ó�� �����մϴ�.");
		while (true) {
			System.out.println("���� �л� : ");
			String change = sc.nextLine();

			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getName().equals(change)) {
					System.out.println("����ó = ");
					studentList.get(i).setAdress(sc.nextLine());
					System.out.println("����Ϸ�Ǿ����ϴ�.");
					return; // �޼ҵ� ���� ����
				}

			}
			System.out.println("�ش��ϴ� �л��� �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

	public void StudentDelete() {
		System.out.println("�л� ������ �����մϴ�.");
		while (true) {
			System.out.println("������ �л� : ");
			String name = sc.nextLine();
			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getName().equals(name)) {
					System.out.println("���� �л� : ");
					studentList.remove(i);
					System.out.println("�л��� ������ �����Ͽ����ϴ�.");
					return; // �޼ҵ� ���� ����
				}

			}
			System.out.println("�ش��ϴ� �л��� �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

	public void displayInfo() {
		while (true) {
			System.out.println("������ ������ �л� : ");
			String name = sc.nextLine();
			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getName().equals(name)) {
					System.out.println("��û�Ͻ� �л��� �����Դϴ�.");
					System.out.println("�̸� : " + studentList.get(i).getName() + ", " + "���� : "
							+ studentList.get(i).getAge() + ", " + "����ó : " + studentList.get(i).getAdress() + ", "
							+ "���� : " + studentList.get(i).getGrade());
					return; // �޼ҵ� ���� ����
				}

			}
			System.out.println("�ش��ϴ� �л��� �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

	public void AllDisplayInfo() {
		System.out.println("��� �л��� �����Դϴ�. �� �л� ���� " + studentList.size() + "���Դϴ�.");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("�̸� : " + studentList.get(i).getName() + ", " + "���� : " + studentList.get(i).getAge()
					+ ", " + "���� : " + studentList.get(i).getGrade());
		}
	}

	public void exitProgram() {
		System.exit(0);
	}
}
