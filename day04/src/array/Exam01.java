package array;

public class Exam01 {

	public static void main(String[] args) {
//		2020-06-26 �迭
//		array : ������ ������ ���� �� �ִ� ����. �⺻�ڷ����� �ƴϴ�

		int[] score; // �迭�� ����
		score = new int[5]; // �迭�� 5���� ������ ���� ������ ����
		int[] score2 = new int[10]; // �⺻ 0���� �ʱ�ȭ //�迭�� �� �� 0��°~n���� ��ҷ� ����.
		// ex) score[0] ���ھ��� 0��° ���, score[3] ���ھ��� 3��° ���

		System.out.println(score[0]);
		System.out.println(score2); // score2�迭�� �ּҸ� ���
		System.out.println(score2[0]); // score2�迭�� 0��° ��Ҹ� �����.
		System.out.println(score2[9]); // 0~9 �� 10��

		score2[0] = 10; // score2�迭�� 0��° ��ҿ� 10�� �ʱ�ȭ
		score2[1] = 9; // score2�迭�� 1��° ��ҿ� 9�� �ʱ�ȭ
		score2[2] = 8; // score2�迭�� 2��° ��ҿ� 8�� �ʱ�ȭ

		System.out.println();

		System.out.println(score2[0]);
		System.out.println(score2[1]);
		System.out.println(score2[2]);

		// �迭�� �ʱ�ȭ ���
		int[] arr1 = new int[3]; // 0 0 0 �ǹ����� �ַ� ���
//		
		int[] arr2 = new int[] { 1, 2, 3 }; // 0~2��° ��ҿ� ���� 1,2,3 �ʱ�ȭ
//		int[] arr2;
//		arr2 = new int[] { 1, 2, 3 }; // ����� �ʱ�ȭ �и� ����

		int[] arr3 = {1,2,3}; // 0~2��° ��ҿ� ���� 1,2,3 �ʱ�ȭ
//		int[] arr3;
//		arr3 = {1,2,3}; // ����� �ʱ�ȭ �и� �Ұ���
	}

}
