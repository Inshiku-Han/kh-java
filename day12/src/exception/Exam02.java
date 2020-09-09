package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("첫번째 수 :");
			int a = sc.nextInt();
			System.out.print("두번째 수 :");
			int b = sc.nextInt();
			System.out.println(a / b);
		} catch (InputMismatchException e) {
			System.out.println("입력 오류");

		} catch (ArithmeticException e) { // 예외의 종류는 오류를 발생시켜가며 파악
			System.out.println("나누기 오류");
		} catch(Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		System.out.println("정상 종료");
		sc.close();
	}
}
