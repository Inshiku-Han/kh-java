package if_switch;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// ���ڿ��� �������� ���� ������ if(����.equals(���ڿ�)){} �� ���
		Scanner sc = new Scanner(System.in);
		String gender = null; // String�� null�� �ʱ�ȭ
		String man = null;

		System.out.print("�Է��ϼ��� : ");
		gender = sc.nextLine();
		
		if (gender.equals("��")) {
			man = "�����Դϴ�.";
		} else if (gender.equals("��")) {
			man = "�����Դϴ�.";
		} else {
			man = "�ٽ� �Է��ϼ���.";
		}
		System.out.println(man);
		sc.close();
	}

}
