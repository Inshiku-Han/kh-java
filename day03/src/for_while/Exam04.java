package for_while;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1~100 ���

//		for(int i = 1; i <= 100; ++i) {
//			System.out.println(i);
//		}

		// ������ 2�� ���

//		for (int i = 1; i <= 9; ++i) {
//			System.out.println("2 * " + i + " = " + (2 * i));
//		}

		// 2 4 6 8 10 ���

//		for(int i = 2; i <= 10; i+=2) {
//			System.out.println(i);
//		}
//		for(int i = 1; i<=5; i++) {
//			System.out.println(i*2);
//		}

		// 10~0���� ���

//		for (int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}

		// 1~10������ ���� ���. //��� �� ��

//		int sum = 0;
//		for (int i = 1; i <= 10; ++i) {
//			sum = sum + i;

//		}
//		System.out.println(sum);

		// 1���� 1������ ���� 1
		// 1���� 2������ ���� 1
		// 1���� 3������ ���� 6
		// 1���� 4������ ���� 10
		// ...
		// 1���� 10������ ���� 55

//		int sum = 0;

//		for (int i = 1; i <= 10; ++i) {
//			sum = sum + i;
//			System.out.println("1���� " + i + "������ �� = " + sum);
//		}

		// 1 ~ 100�� �� �߿��� 3�� ����� ������ ���

//		int cnt = 0;
//		for (int i = 1; i <= 100; ++i) {
//			if ((i % 3) == 0) {
//				++cnt;
//			}
//		}
//		System.out.println(cnt); // 3�� ����϶��� 1�� ī��Ʈ�ؼ� 3�� ����� ������ ����.

//		 1 ~ 100�� �� �߿��� 3�� ������� ���

//		for (int i = 1; i < 100; ++i) {
//			if ((i % 3) == 0) {
//				System.out.println(i);
//			}
//		}

		// 1 ~ 100�� �� �߿��� 3�� ������ ������ ���

//		int cnt = 0;
//		for (int i = 1; i < 100; ++i) {
//			if ((i % 3) == 0) {
//				++cnt;
//				System.out.println(i);
//			}
//		}
//		System.out.println();
//		System.out.println("3�� ����� ���� = " + cnt);

		// ������ �ϳ� �Է¹ް�, 0 ~ �Է¹��� ������ ��,
		// ¦���� ������ ���ϼ���,
		// 0�� ¦���� �ƴϴ�.

		System.out.print("�Է� : ");
		int num = sc.nextInt();

		int cnt = 0;
		for (int i = 1; i <= num; ++i) {
			if (i % 2 == 0) {
				++cnt;
			}
		}
		System.out.println(cnt - 1); // 0�̶�� �ϳ��� ������ ����

		sc.close();
	}

}
