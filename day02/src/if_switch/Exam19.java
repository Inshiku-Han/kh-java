package if_switch;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		// 간단한 계산기 프로그램을 IF문을 활용하여 만들어 보자. 계산을 위해 두 정수가 필요하고, 연산자(+ - * /)를 입력받을 문자열 변수도
		// 필요해 보인다. 만약 두 수를 각각 1,2로 입력받고 연산자로 +를 입력받았다면 출력결과는 1 + 2 = 3처럼 되어야한다.
		// 잘못되면 '연산자를 잘못 입력하였습니다.'라고 출력되여야 한다.
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String str = null;
		boolean x = true;

		System.out.print("첫번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		num2 = sc.nextInt();
		System.out.print("연산자 : ");
		str = sc.next();

		System.out.println();

		if (str.equals("+")) {
			System.out.println(num1 + " " + str + " " + num2 + " = " + (num1 + num2));
		} else if (str.equals("-")) {
			System.out.println(num1 + " " + str + " " + num2 + " = " + (num1 - num2));
		} else if (str.equals("*")) {
			System.out.println(num1 + " " + str + " " + num2 + " = " + (num1 * num2));
		} else if (str.equals("/")) {
			System.out.println(num1 + " " + str + " " + num2 + " = " + (num1 / num2));
		} else {
			System.out.println("연산자를 잘못 출력하였습니다.");
		}

		System.out.println();

		if (str.equals("+")) {
			num3 = num1 + num2;
		} else if (str.equals("-")) {
			num3 = num1 - num2;
		} else if (str.equals("*")) {
			num3 = num1 * num2;
		} else if (str.equals("/")) {
			num3 = num1 / num2;
		} else {
			x = false;
		}
		if(x) {
			System.out.println(num1 + " " + str + " " + num2 + " = " + (num3));
		}else {
			System.out.println("연산자를 잘못 출력하였습니다.");
		}
	sc.close();
	}

}
