package ComplexCalculator;

import java.util.Scanner;

public class ComplexCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		System.out.print("������ : ");
		String oper = sc.next();

//		Add add = new Add();
//		Sub sub = new Sub();
//		Mul mul = new Mul();
//		Div div = new Div();
//
//		if (oper.contentEquals("+")) {
//			add.setValue(num1, num2);
//			System.out.println(num1 + oper + num2 + " = " + add.calculate());
//		} else if (oper.contentEquals("-")) {
//			sub.setValue(num1, num2);
//			System.out.println(num1 + oper + num2 + " = " + sub.calculate());
//		} else if (oper.contentEquals("*")) {
//			mul.setValue(num1, num2);
//			System.out.println(num1 + oper + num2 + " = " + mul.calculate());
//		} else if (oper.contentEquals("/")) {
//			div.setValue(num1, num2);
//			System.out.println(num1 + oper + num2 + " = " + div.calculate());
//		} // ��

		System.out.println();

		switch (oper) { // ������ ������ ������ ����ġ�� ���
		case "+":
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.println(num1 + oper + num2 + " = " + add.calculate());
			break;

		case "-":
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(num1 + oper + num2 + " = " + sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.println(num1 + oper + num2 + " = " + mul.calculate());
			break;

		case "/":
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.println(num1 + oper + num2 + " = " + div.calculate());
			break;
		} // �ؼ�
		sc.close();
	}

}
