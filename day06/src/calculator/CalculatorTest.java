package calculator;

import java.util.Scanner;

// 깊게 볼 것 
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		// 데이터 입력
		Calculator c = setData(cal);
		// 결과 출력
		displayResult(c);

	}

	//데이터 입력 메소드
	public static Calculator setData(Calculator cal) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 : ");
		String op = sc.nextLine();

		cal.setNum1(num1);
		cal.setNum2(num2);
		cal.setOp(op);

		sc.close();
		return cal;
	}
	//결과 출력 메소드
	public static void displayResult(Calculator c) {
		if (c.getOp().contentEquals("+")) { // equals() : 내용 비교, == : 주소 비교. 문자비교할땐 equals 써라
			System.out.println("값 = " + c.plus());
		} else if (c.getOp().contentEquals("-")) {
			System.out.println("값 = " + c.minus());
		} else if (c.getOp().contentEquals("*")) {
			System.out.println("값 = " + c.multi());
		} else if (c.getOp().contentEquals("/")) {
			System.out.println("값 = " + c.divide());
		} else {
			System.out.println("again");
		}

		switch (c.getOp()) {
		case "+":
			System.out.println("값 = " + c.plus());
			break;
		case "-":
			System.out.println("값 = " + c.minus());
			break;
		case "*":
			System.out.println("값 = " + c.multi());
			break;
		case "/":
			System.out.println("값 = " + c.divide());
			break;
		default:
			System.out.println("again");
			break;

		}
	}

}
