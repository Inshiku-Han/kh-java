package array;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
//		국 영 수 총점 평균 배열
		Scanner sc = new Scanner(System.in);

//		System.out.print("국어, 영어, 수학 점수를 입력하세요 : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int sum = a + b + c;
//		double avg = sum / 3.0;
//		int[] arr = { a, b, c, sum};
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//
//		}
//		System.out.println(avg); // 나

		int[] scores = new int[4];
		String[] subject = { "국어", "수학", "영어" };
		double avg = 0.0;

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "점수 : ");
			scores[i] = sc.nextInt();
			scores[scores.length - 1] = scores[scores.length - 1] + scores[i];

		}
		avg = scores[scores.length - 1] / (double) subject.length;
		System.out.println();

		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "점수 : " + scores[i]);
		}
		System.out.println("총점 : " + scores[scores.length - 1]);
		System.out.println("평균 : " + avg);
		sc.close();
	}

}
