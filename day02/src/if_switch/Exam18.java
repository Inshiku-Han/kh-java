package if_switch;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		// �� ������ �����ϰ� scanner�� ���� �Է¹޴´�.
		// �׸��� �� ���� ū ������� ����Ͽ�����
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		int mid = 0;
		int min = 0;

		System.out.print("ù��° �� : ");
		a = sc.nextInt();
		System.out.print("�ι�° �� : ");
		b = sc.nextInt();
		System.out.print("����° �� : ");
		c = sc.nextInt();

		System.out.println();

		if (a > b && b > c) {
			max = a;
			mid = b;
			min = c;
		} else if (a > c && c > b) {
			max = a;
			mid = c;
			min = b;
		} else if (b > a && a > c) {
			max = b;
			mid = a;
			min = c;
		} else if (b > c && c > a) {
			max = b;
			mid = c;
			min = a;
		} else if (c > a && a > b) {
			max = c;
			mid = a;
			min = b;
		} else if (c > b && b > a) {
			max = c;
			mid = b;
			min = a;

		}
		System.out.println(max + " > " + mid + " > " + min); // �� & �ؼ�
		
		
		sc.close();
	}

}
