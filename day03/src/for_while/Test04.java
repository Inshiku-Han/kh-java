package for_while;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
//		1. Scanner�� �̿��Ͽ� ������ 3�� �Է¹ް� �� �� ���� ���� �ﰢ���� ���� �� �ִ����� �Ǻ��϶�. 
//		�ﰢ���� �����Ϸ��� �� ���� ���� �ٸ� �� ���� �պ��� �ݵ�� Ŀ�� �Ѵ�.
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ��");
		num1 = sc.nextInt();
		System.out.print("�ι�° ��");
		num2 = sc.nextInt();
		System.out.print("����° ��");
		num3 = sc.nextInt();

		if ((num1 + num2) > num3 || (num1 + num3) > num2 || (num2 + num3) > num1) {
			System.out.println("����");
		}else {
			System.out.println("�Ұ���");
		}
		
		sc.close();
	}
}
