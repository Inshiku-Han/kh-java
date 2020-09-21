package for_while;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
//		1. Scanner를 이용하여 정수를 3개 입력받고 이 세 개의 수로 삼각형을 만들 수 있는지를 판별하라. 
//		삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 한다.
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수");
		num1 = sc.nextInt();
		System.out.print("두번째 수");
		num2 = sc.nextInt();
		System.out.print("세번째 수");
		num3 = sc.nextInt();

		if ((num1 + num2) > num3 || (num1 + num3) > num2 || (num2 + num3) > num1) {
			System.out.println("가능");
		}else {
			System.out.println("불가능");
		}
		
		sc.close();
	}
}
