package ifPractice;

import java.util.Scanner;

public class ifPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();

		if (str.equals("��")) {
			System.out.println("�����Դϴ�.");
		} else if (str.equals("��")) {
			System.out.println("�����Դϴ�");
		}
		sc.close();
	}

}
