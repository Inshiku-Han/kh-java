package array;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// 1. ������ 5�� ������ �� �ִ� �迭�� �����ϰ�, �迭�� 2��°, 4��° ����� ���� ����ϼ���.
//		int[] arr1 = new int[5];
//
//		System.out.print(arr1[2] + "\t");
//		System.out.print(arr1[4]);
//		System.out.println("\n");
//		// 2. ������ 10�� ������ �� �ִ� �迭�� �����ϰ� ��� ����� ���� ����غ��ƶ�.
//		int[] arr2 = new int[10];
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + "\t");
//		}
//		System.out.println("\n");
//		// 3. ������ 10�� ������ �� �ִ� �迭�� �����ϰ� ��� ��ҿ� 3�� �־��.
//		// �׸��� 3�� �� ������ ����Ͽ� Ȯ���غ��ƶ�.
//		int[] arr3 = new int[3];
//		for (int i = 0; i < arr3.length; i++) {
//			arr3[i] = 3;
//
//			System.out.print(arr3[i] + "\t");
//		}
//		System.out.println("\n");
//
//		// 4. ������ 10�� ������ �� �ִ� �迭�� �����ϰ�
//		// �� ��ҿ� 1 ~ 10���� ���ʴ�� �־��. �׸��� ���� �� ������ Ȯ���غ���.
//
//		int[] arr4 = new int[10];
//
//		for (int i = 0; i < arr4.length; i++) {
//			arr4[i] = i + 1;
//			System.out.print(arr4[i] + "\t");
//		}
//		System.out.println("\n");

		// 5. 1,5,7�� �ʱⰪ���� �����ϰ� �ִ� �迭�� �����,
		// �迭�� ��� ����� ���� ����غ��ƶ�. // �ٽ� ��

//		int[] arr5 = {1,5,7};
//		int sum = 0;
//		for(int i = 0 ; i < arr5.length ; i++) {
//			sum = sum + arr5[i];
//		}
//		System.out.println(sum); retry

//		int[] arr5 = { 1, 5, 7 };
//		int sum = 0;
//		for (int i = 0; i < arr5.length; i++) {
//			sum = sum + arr5[i];
//		}
//		System.out.println(sum); // �ؼ�

		// 6. ������ 5�� ������ �� �ִ� �迭�� �����, scanner�� ���� �Է¹��� ����
		// �ϳ��� �迭�� ��ҿ� �����غ���. ���� Ű����� 1 2 3 4 5 �Է��ߴٸ�
		// �迭�� ��ҿ� ���� 1 2 3 4 5�� ����Ǿ�� �Ѵ�. ����� ���� ����� Ȯ���� ���ƶ�

		Scanner sc = new Scanner(System.in);

//		int[] arr6 = new int[5];
//
//		for (int i = 0; i < arr6.length; i++) {
//			System.out.print("���ڸ� �Է����ּ��� : ");
//			arr6[i] = sc.nextInt();
//
//		}
//		for (int i = 0; i < arr6.length; i++) {
//
//			System.out.print(arr6[i] + " ");
//		}
//		
//		int[] arr6 = new int[5];
//		
//	for(int i = 0; i < arr6.length ; i++) {
//		arr6[i] = sc.nextInt();
//	}
//		for(int j = 0; j < arr6.length ; j++) {
//			System.out.println(arr6[j]);
//		} // �ؼ�
//	
		sc.close();
		// 7. 1 2 3 4 5 6 7 8 �� �ʱ�ȭ�� �迭�� �����,
		// �迭�� ��� �� ¦���� ������ ���ϴ� ���α׷��� ������.
		
//		int[] arr7 = new int[8];
//		int sum = 0;
//		
//		for(int i = 0; i < arr7.length ; i++) {
//			arr7[i] = arr7[i] + i;
//		}
//		for(int i = 0; i < arr7.length ; i++) {
//			if(arr7[i] % 2 == 0) {
//				sum++;
//			}
//		}
//		System.out.println(sum); retry
		
//		int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8};
//		int cnt = 0;
//		for(int i = 0; i < arr7.length ; i++) {
//			if(arr7[i] % 2 == 0) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt); �ؼ�
	}

}
