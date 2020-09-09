package if_switch;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// 1 ~ 3 사이의 정수를 입력받고, 입력받은 숫자를 출력하되,
		// swtich문을 사용하여 출력하세요
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("입력 : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println(num + " 입니다.");
			break;
		case 2:
			System.out.println(num + " 입니다.");
			break;
		case 3:
			System.out.println(num + " 입니다.");
			break;
		default:
			System.out.println("잘못된 값입니다.");
		}
		sc.close();
	}

}
