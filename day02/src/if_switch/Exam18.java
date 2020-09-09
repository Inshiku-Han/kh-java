package if_switch;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		// 세 정수를 선언하고 scanner로 값을 입력받는다.
		// 그리고 세 수를 큰 순서대로 출력하여보라
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		int mid = 0;
		int min = 0;

		System.out.print("첫번째 수 : ");
		a = sc.nextInt();
		System.out.print("두번째 수 : ");
		b = sc.nextInt();
		System.out.print("세번째 수 : ");
		c = sc.nextInt();

		System.out.println();

		if (a > b && b > c) {
			max = a;
			mid = b;
			min = c;
		} else if (a > c && c > b) {
			max = a;
			mid = c;
			min = b;
		} else if (b > a && a > c) {
			max = b;
			mid = a;
			min = c;
		} else if (b > c && c > a) {
			max = b;
			mid = c;
			min = a;
		} else if (c > a && a > b) {
			max = c;
			mid = a;
			min = b;
		} else if (c > b && b > a) {
			max = c;
			mid = b;
			min = a;

		}
		System.out.println(max + " > " + mid + " > " + min); // 나 & 해설
		
		
		sc.close();
	}

}
