package if_switch;

import java.util.Scanner;

public class Exam08_2 {

	public static void main(String[] args) {
		// 0~100������ ���� �ϳ��� �Է¹޾�,
		// �� ���� 90~100�� ���̸� A�� ���
		// �� ���� 80~90�� ���̸� B�� ���
		// �� ���� 70~80�� ���̸� C�� ���
		// �� ���� 70�� �̸��̸� D�� ���
		// ��� �� ��
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("���� �Է� : ");
		num = sc.nextInt();

		switch (num / 10) {
		case 10: // 100
		case 9: // 90~99
			System.out.println("A");
			break;
		case 8: // 80~89
			System.out.println("B");
			break;
		case 7: // 70~79
			System.out.println("C");
			break;
		default: // ~69
			System.out.println("D");
		}
		sc.close();
	}

}
