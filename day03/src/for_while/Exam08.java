package for_while;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
//		����, ���� ������ �Է¹޾� ������ ������, ����, ����� ����Ѵ�.
//		��, ������ 0~100������ ������ �Է��� �����ϰ�,
//		�� ���� ������ �Է¹����� �ٽ� �Է¹��� �� �ֵ���
//		���α׷��� �ۼ��ϼ���
		Scanner sc = new Scanner(System.in);

//		while (true) {
//		System.out.print("����, ���� ������ �Է��ϼ��� : ");
//		int kor = sc.nextInt();
//		int math = sc.nextInt();
//			if (kor <= 100 && math <= 100) {
//				break;
//			}
//	}
//		
//		System.out
//				.println("���� ���� : " + kor + " ���� ���� : " + math + " ���� : " + (kor + math) + " ��� : " + (kor + (double)math) / 2);

		int kor = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;

		while (true) {
			System.out.print("���� ���� : ");
			kor = sc.nextInt();

			if (kor >= 0 && kor <= 100) {
				break;
			}
			System.out.println("������ 0 ~ 100���̾�� �մϴ�.");

		}
		while (true) {
			System.out.print("���� ���� : ");
			math = sc.nextInt();

			if (math >= 0 && math <= 100) {
				break;
			}
			System.out.println("������ 0 ~ 100���̾�� �մϴ�.");

		}

		total = kor + math;
		avg = total / 2.0;
		System.out.println();
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + math);
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);

		sc.close();
	}

}
