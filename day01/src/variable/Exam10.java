package variable;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
//		����, ����, ���� ������ �Է¹޾Ƽ�
//		�� ������ ������, �� ������ ����, ��ձ���
//		����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
//		ó���� int�� 0, double�� 0.0�־ �ʱ�ȭ
		int korScore = 0;
		int mathScore = 0;
		int engScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		System.out.print("���� ���� : ");
		korScore = sc.nextInt();
		System.out.print("���� ���� : ");
		mathScore = sc.nextInt();
		System.out.print("���� ���� : ");
		engScore = sc.nextInt();
		
//		������ �ڵ��ϼ� ����
		System.out.println("���� ���� = " + korScore);
		System.out.println("���� ���� = " + mathScore);
		System.out.println("���� ���� = " + engScore);
		
		totalScore = korScore + mathScore + engScore;//totalScore�� ����
		avg = totalScore / 3.0;//�Ǽ����� �������� totalScore/�Ǽ���; ���� �ؾ���
		System.out.println("���� = " + totalScore);
		System.out.println("��� = " + avg);
		sc.close();
	}

}
