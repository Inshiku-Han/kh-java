package array;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
//		�� �� �� ���� ��� �迭
		Scanner sc = new Scanner(System.in);

//		System.out.print("����, ����, ���� ������ �Է��ϼ��� : ");
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
//		System.out.println(avg); // ��

		int[] scores = new int[4];
		String[] subject = { "����", "����", "����" };
		double avg = 0.0;

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "���� : ");
			scores[i] = sc.nextInt();
			scores[scores.length - 1] = scores[scores.length - 1] + scores[i];

		}
		avg = scores[scores.length - 1] / (double) subject.length;
		System.out.println();

		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "���� : " + scores[i]);
		}
		System.out.println("���� : " + scores[scores.length - 1]);
		System.out.println("��� : " + avg);
		sc.close();
	}

}
