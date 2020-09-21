package julyFourteenth;

import java.util.Scanner;

public class ArrayActive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array array = new Array();
		System.out.println("프로그램을 시작했습니다.");
		array.start();
		while (true) {
			System.out.print("1. 값 저장\t2. 값 제거\t3. 프로그램 종료 =>");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				array.save();
				array.result();
				break;
			case 2:
				array.delete();
				array.result();
				break;
			case 3:
				sc.close();
				array.exitProgram();
				break;
			default:
				System.out.println("다시 입력해주세요.");

			}
		}
	}
}
