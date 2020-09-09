package array;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// 1. 정수를 5개 저장할 수 있는 배열을 생성하고, 배열의 2번째, 4번째 요소의 값을 출력하세요.
//		int[] arr1 = new int[5];
//
//		System.out.print(arr1[2] + "\t");
//		System.out.print(arr1[4]);
//		System.out.println("\n");
//		// 2. 정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소의 값을 출력해보아라.
//		int[] arr2 = new int[10];
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + "\t");
//		}
//		System.out.println("\n");
//		// 3. 정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소에 3을 넣어라.
//		// 그리고 3이 잘 들어갔는지 출력하여 확인해보아라.
//		int[] arr3 = new int[3];
//		for (int i = 0; i < arr3.length; i++) {
//			arr3[i] = 3;
//
//			System.out.print(arr3[i] + "\t");
//		}
//		System.out.println("\n");
//
//		// 4. 정수를 10개 저장할 수 있는 배열을 생성하고
//		// 각 요소에 1 ~ 10까지 차례대로 넣어보라. 그리고 값이 잘 들어갔는지 확인해보라.
//
//		int[] arr4 = new int[10];
//
//		for (int i = 0; i < arr4.length; i++) {
//			arr4[i] = i + 1;
//			System.out.print(arr4[i] + "\t");
//		}
//		System.out.println("\n");

		// 5. 1,5,7을 초기값으로 저장하고 있는 배열을 만들고,
		// 배열의 모든 요소의 합을 출력해보아라. // 다시 해

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
//		System.out.println(sum); // 해설

		// 6. 정수를 5개 저장할 수 있는 배열을 만들고, scanner를 통해 입력받은 값을
		// 하나씩 배열의 요소에 저장해보자. 만약 키보드로 1 2 3 4 5 입력했다면
		// 배열의 요소에 각각 1 2 3 4 5가 저장되어야 한다. 출력을 통해 결과를 확인해 보아라

		Scanner sc = new Scanner(System.in);

//		int[] arr6 = new int[5];
//
//		for (int i = 0; i < arr6.length; i++) {
//			System.out.print("숫자를 입력해주세요 : ");
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
//		} // 해설
//	
		sc.close();
		// 7. 1 2 3 4 5 6 7 8 로 초기화된 배열을 만들고,
		// 배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.
		
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
//		System.out.println(cnt); 해설
	}

}
