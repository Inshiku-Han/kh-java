package method;

public class Exam03 {

	public static void main(String[] args) {
		// 1.'안녕하세요.' 라는 문자열을 출력하는 기능을 가진 메소드를 선언하고 호출
		 hello();

		// 2.'반갑습니다'라는 문자열을 출력하는 기능을 가진 메소드와
		// '어서오세요'라는 문자열을 출력하는 메소드를 각각 선언하고,
		// 실행 결과 '반갑습니다 어서오세요'라는 문자열이 출력되게 호출
		meet();
		 	welcome();

		// 3.정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드 선언 호출
		number(20);
		
		//4.문자열 매개변수 메소드 선언 호출
		character("피곤");
		 
		 //다른 메소드에 다른 메소드 넣어서 사용 가능 ex)b메소드안에 a메소드 호출 후 b메소드를 메인메소드에서 호출가능
	}

	public static void hello() {
		System.out.println("안녕하세요.");
	}

	public static void meet() {
		System.out.print("반갑습니다");
		System.out.print(" ");
		welcome();
	}

	public static void welcome() {
		System.out.println("어서오세요");
	}

	public static void number(int num) {
		System.out.println(num);
	}
	public static void character(String abc) {
		System.out.println(abc);
	}
}
