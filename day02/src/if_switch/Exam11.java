package if_switch;

public class Exam11 {

	public static void main(String[] args) {
		// 스위치 케이스 브레이크 문
		int n = 4;

		switch (n) {
		case 1:
			System.out.println("n = 1");
			break;
		case 2:
			System.out.println("n = 2");
			break;
		case 3:
			System.out.println("n = 3");
			break;
		default:
			System.out.println("잘못된 값입니다.");
		}

	}

}
