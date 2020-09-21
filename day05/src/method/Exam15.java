package method;

import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		// 11. 입력받은 정수를 매수변수로 받아, 해당 정수를 출력하는 메소드를 선언하고 호출해보세요.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num(num);
		sc.close();
	}

	public static void num(int a) {
		System.out.println(a);
	}
}
