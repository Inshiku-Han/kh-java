package if_switch;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// ���� �ϳ��� �Է¹޾� �Է¹��� ������ 
		// ¦���� '¦���Դϴ�' �� ����ϰ�,
		// Ȧ���� 'Ȧ���Դϴ�' �� ����ϼ���. %2¦�� %3Ȧ��
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num = sc.nextInt();
		
		System.out.println();
		
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else if(num % 3 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}
		sc.close();
	}

}
