package calculator;

import java.util.Scanner;

// ��� �� �� 
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		// ������ �Է�
		Calculator c = setData(cal);
		// ��� ���
		displayResult(c);

	}

	//������ �Է� �޼ҵ�
	public static Calculator setData(Calculator cal) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("������ : ");
		String op = sc.nextLine();

		cal.setNum1(num1);
		cal.setNum2(num2);
		cal.setOp(op);

		sc.close();
		return cal;
	}
	//��� ��� �޼ҵ�
	public static void displayResult(Calculator c) {
		if (c.getOp().contentEquals("+")) { // equals() : ���� ��, == : �ּ� ��. ���ں��Ҷ� equals ���
			System.out.println("�� = " + c.plus());
		} else if (c.getOp().contentEquals("-")) {
			System.out.println("�� = " + c.minus());
		} else if (c.getOp().contentEquals("*")) {
			System.out.println("�� = " + c.multi());
		} else if (c.getOp().contentEquals("/")) {
			System.out.println("�� = " + c.divide());
		} else {
			System.out.println("again");
		}

		switch (c.getOp()) {
		case "+":
			System.out.println("�� = " + c.plus());
			break;
		case "-":
			System.out.println("�� = " + c.minus());
			break;
		case "*":
			System.out.println("�� = " + c.multi());
			break;
		case "/":
			System.out.println("�� = " + c.divide());
			break;
		default:
			System.out.println("again");
			break;

		}
	}

}
