package if_switch;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// 1 ~ 3 ������ ������ �Է¹ް�, �Է¹��� ���ڸ� ����ϵ�,
		// swtich���� ����Ͽ� ����ϼ���
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("�Է� : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println(num + " �Դϴ�.");
			break;
		case 2:
			System.out.println(num + " �Դϴ�.");
			break;
		case 3:
			System.out.println(num + " �Դϴ�.");
			break;
		default:
			System.out.println("�߸��� ���Դϴ�.");
		}
		sc.close();
	}

}
