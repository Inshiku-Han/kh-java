package ifPractice;

import java.util.Scanner;

public class ifPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();

		System.out.print("������ : ");
		String str = sc.next();

		if (str.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (str.equals("-")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 - num2));

		} else if (str.equals("*")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 * num2));

		} else if (str.equals("/")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 / num2));
		}
		sc.close();

	}

}
