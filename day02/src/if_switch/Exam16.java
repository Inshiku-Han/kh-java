package if_switch;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// 문자열이 같은지를 비교할 때에는 if(변수.equals(문자열)){} 를 사용
		Scanner sc = new Scanner(System.in);
		String gender = null; // String은 null로 초기화
		String man = null;

		System.out.print("입력하세요 : ");
		gender = sc.nextLine();
		
		if (gender.equals("남")) {
			man = "남자입니다.";
		} else if (gender.equals("여")) {
			man = "여자입니다.";
		} else {
			man = "다시 입력하세요.";
		}
		System.out.println(man);
		sc.close();
	}

}
