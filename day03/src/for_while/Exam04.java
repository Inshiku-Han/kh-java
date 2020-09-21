package for_while;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1~100 출력

//		for(int i = 1; i <= 100; ++i) {
//			System.out.println(i);
//		}

		// 구구단 2단 출력

//		for (int i = 1; i <= 9; ++i) {
//			System.out.println("2 * " + i + " = " + (2 * i));
//		}

		// 2 4 6 8 10 출력

//		for(int i = 2; i <= 10; i+=2) {
//			System.out.println(i);
//		}
//		for(int i = 1; i<=5; i++) {
//			System.out.println(i*2);
//		}

		// 10~0까지 출력

//		for (int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}

		// 1~10까지의 합을 출력. //깊게 볼 것

//		int sum = 0;
//		for (int i = 1; i <= 10; ++i) {
//			sum = sum + i;

//		}
//		System.out.println(sum);

		// 1부터 1까지의 합은 1
		// 1부터 2까지의 합은 1
		// 1부터 3까지의 합은 6
		// 1부터 4까지의 합은 10
		// ...
		// 1부터 10까지의 합은 55

//		int sum = 0;

//		for (int i = 1; i <= 10; ++i) {
//			sum = sum + i;
//			System.out.println("1부터 " + i + "까지의 합 = " + sum);
//		}

		// 1 ~ 100의 수 중에서 3의 배수의 갯수를 출력

//		int cnt = 0;
//		for (int i = 1; i <= 100; ++i) {
//			if ((i % 3) == 0) {
//				++cnt;
//			}
//		}
//		System.out.println(cnt); // 3의 배수일때만 1씩 카운트해서 3의 배수의 개수를 센다.

//		 1 ~ 100의 수 중에서 3의 배수들을 출력

//		for (int i = 1; i < 100; ++i) {
//			if ((i % 3) == 0) {
//				System.out.println(i);
//			}
//		}

		// 1 ~ 100의 수 중에서 3의 배수들과 갯수를 출력

//		int cnt = 0;
//		for (int i = 1; i < 100; ++i) {
//			if ((i % 3) == 0) {
//				++cnt;
//				System.out.println(i);
//			}
//		}
//		System.out.println();
//		System.out.println("3의 배수의 개수 = " + cnt);

		// 정수를 하나 입력받고, 0 ~ 입력받은 수까지 중,
		// 짝수의 갯수를 구하세요,
		// 0은 짝수가 아니다.

		System.out.print("입력 : ");
		int num = sc.nextInt();

		int cnt = 0;
		for (int i = 1; i <= num; ++i) {
			if (i % 2 == 0) {
				++cnt;
			}
		}
		System.out.println(cnt - 1); // 0이라는 하나의 개수를 뺀다

		sc.close();
	}

}
