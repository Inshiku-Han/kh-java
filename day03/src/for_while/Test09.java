package for_while;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// �� ���� ��� n�� �Է¹޾� �� �� ������ n����� �� ���
		// ��, �Է��� ���� ������ �޴� ������ ����

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // ���� ��
		int num2 = sc.nextInt(); // ū ��
		int a = sc.nextInt(); // ���
		int sum = 0; // ���� ������ ����

		for (int i = num1; i <= num2; i++) {
			if (i % a == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		sc.close();

	}

}
