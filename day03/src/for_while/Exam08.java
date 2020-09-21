package for_while;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
//		국어, 수학 점수를 입력받아 각각의 점수와, 총점, 평균을 출력한다.
//		단, 점수는 0~100사이의 점수만 입력이 가능하고,
//		그 외의 점수를 입력받으면 다시 입력받을 수 있도록
//		프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);

//		while (true) {
//		System.out.print("국어, 수학 점수를 입력하세요 : ");
//		int kor = sc.nextInt();
//		int math = sc.nextInt();
//			if (kor <= 100 && math <= 100) {
//				break;
//			}
//	}
//		
//		System.out
//				.println("국어 점수 : " + kor + " 수학 점수 : " + math + " 총점 : " + (kor + math) + " 평균 : " + (kor + (double)math) / 2);

		int kor = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;

		while (true) {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();

			if (kor >= 0 && kor <= 100) {
				break;
			}
			System.out.println("점수는 0 ~ 100점이어야 합니다.");

		}
		while (true) {
			System.out.print("영어 점수 : ");
			math = sc.nextInt();

			if (math >= 0 && math <= 100) {
				break;
			}
			System.out.println("점수는 0 ~ 100점이어야 합니다.");

		}

		total = kor + math;
		avg = total / 2.0;
		System.out.println();
		System.out.println("영어 점수 : " + kor);
		System.out.println("영어 점수 : " + math);
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);

		sc.close();
	}

}
