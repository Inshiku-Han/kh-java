package for_while;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		369 ������ ������. 1~99������ ������ �Է¹ް� ������ 3.6.9�� �ϳ��� �ִ� ��쿡�� 
//		�ڼ�¦�� ���, �� �� �ִ� ���� �ڼ�¦¦�� ���
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("���ڸ� �Է����ּ��� : ");
		a = sc.nextInt();
		
		if(a >= 1 && a <= 99) {
			b = a %10;
		}

		sc.close();
	}
}