package if_switch;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// 주민등록번호 7번째 자리를 입력받는다
		// 주민등록번호 7번째 자리 숫자가 1, 3이면 남자
		// 2, 4이면 여자이다.
		// 입력받은 주민등록번호 7번째 자리의 값에 따라
		// 1, 3을 입력받으면 '남자'라고 출력하고, 2, 4이면 '여자'라고 출력한다.
		// 만약 1~4의 숫자가 아닌 다른 숫자를 입력받았다면
		// '잘못 입력했습니다'라고 출력을 해야 한다.
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("주민등록번호 7번째 자리를 입력해주세요 : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("남자");
			break;
		case 2:
			System.out.println("여자");
			break;
		case 3:
			System.out.println("남자");
			break;
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못 입력했습니다"); // 나
		}
		
		System.out.println();
		
		switch (num) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못 입력했습니다"); // 해설
		}
		sc.close();
	}

}
