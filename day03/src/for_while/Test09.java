package for_while;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// 두 수와 배수 n을 입력받아 두 수 사이의 n배수의 합 출력
		// 단, 입력은 작은 수부터 받는 것으로 간주

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // 작은 수
		int num2 = sc.nextInt(); // 큰 수
		int a = sc.nextInt(); // 배수
		int sum = 0; // 합을 저장할 변수

		for (int i = num1; i <= num2; i++) {
			if (i % a == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		sc.close();

	}

}
