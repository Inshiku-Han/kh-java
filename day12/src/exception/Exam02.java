package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("ù��° �� :");
			int a = sc.nextInt();
			System.out.print("�ι�° �� :");
			int b = sc.nextInt();
			System.out.println(a / b);
		} catch (InputMismatchException e) {
			System.out.println("�Է� ����");

		} catch (ArithmeticException e) { // ������ ������ ������ �߻����Ѱ��� �ľ�
			System.out.println("������ ����");
		} catch(Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		System.out.println("���� ����");
		sc.close();
	}
}
