package ifPractice;

import java.util.Scanner;

public class ifPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();

		if (str.equals("남")) {
			System.out.println("남자입니다.");
		} else if (str.equals("여")) {
			System.out.println("여자입니다");
		}
		sc.close();
	}

}
