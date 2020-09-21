package if_switch;

import java.util.Scanner;

public class Exam08_2 {

	public static void main(String[] args) {
		// 0~100사이의 정수 하나를 입력받아,
		// 그 수가 90~100점 사이면 A를 출력
		// 그 수가 80~90점 사이면 B를 출력
		// 그 수가 70~80점 사이면 C를 출력
		// 그 수가 70점 미만이면 D를 출력
		// 깊게 볼 것
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("점수 입력 : ");
		num = sc.nextInt();

		switch (num / 10) {
		case 10: // 100
		case 9: // 90~99
			System.out.println("A");
			break;
		case 8: // 80~89
			System.out.println("B");
			break;
		case 7: // 70~79
			System.out.println("C");
			break;
		default: // ~69
			System.out.println("D");
		}
		sc.close();
	}

}
