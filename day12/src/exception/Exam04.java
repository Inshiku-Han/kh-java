package exception;

import java.util.Scanner;

public class Exam04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception{  // throws 예외 넘기기
		aaa();
	}

	public static void aaa() throws Exception {
		int a = sc.nextInt();
	}
}