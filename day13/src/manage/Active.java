package manage;

import java.util.Scanner;

public class Active {
	// �л����� ���α׷��� ����� ����.
	// �л����� ���α׷��� �л����, �л���������, �л�����, �л���������� ����� �ִ�.
	// �ش� ���α׷��� �ϼ��ϱ� ���� �л�Ŭ������ �л����� ����� �����ϴ� Ŭ������ �����Ѵ�.
	// �л� Ŭ������ �̸�, ����, ����(A,B,C...), ����ó ������ ������ �ִ�.
	// �л����� Ŭ������ �л����, �л���������(����ó), �л�����, �л���������� ����� �ִ�.
	// �Ʒ��� ���α׷��� ���� �����̴�. �Ʒ��� ���� ���α׷��� ����� �� �ְ� ��������.
	// ����)
	// �л����� ���α׷��� �����մϴ�.
	// 1)�л���� 2)�л���������(����ó) 3)�л����� 4)�л�������� 5)��� �л�������� 6)���α׷� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManage sm = new StudentManage();
		System.out.println("�л����� ���α׷��� �����մϴ�.");
		while (true) {
			System.out.print("1)�л���� 2)�л���������(����ó) 3)�л����� 4)�л�������� 5)��� �л�������� 6)���α׷� ����");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				sm.regStudent();
				break;
			case 2:
				sm.changeTellNumber();
				break;
			case 3:
				sm.StudentDelete();
				break;
			case 4:
				sm.displayInfo();
				break;
			case 5:
				sm.AllDisplayInfo();
				break;
			case 6:
				sc.close();
				sm.exitProgram();
				
			}
			
		}
	}
}
