package if_switch;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		// ������ ���� ���α׷��� IF���� Ȱ���Ͽ� ����� ����. ����� ���� �� ������ �ʿ��ϰ�, ������(+ - * /)�� �Է¹��� ���ڿ� ������
		// �ʿ��� ���δ�. ���� �� ���� ���� 1,2�� �Է¹ް� �����ڷ� +�� �Է¹޾Ҵٸ� ��°���� 1 + 2 = 3ó�� �Ǿ���Ѵ�.
		// �߸��Ǹ� '�����ڸ� �߸� �Է��Ͽ����ϴ�.'��� ��µǿ��� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String str = null;
		boolean x = true;

		System.out.print("ù��° �� : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		num2 = sc.nextInt();
		System.out.print("������ : ");
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
			System.out.println("�����ڸ� �߸� ����Ͽ����ϴ�.");
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
			System.out.println("�����ڸ� �߸� ����Ͽ����ϴ�.");
		}
	sc.close();
	}

}
