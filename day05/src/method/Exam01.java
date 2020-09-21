package method;

public class Exam01 {

	public static void main(String[] args) { // 메인 메소드
		// 2020-06-29 객체지향
		// String[] args 문자열 배열
		System.out.println("프로그램 시작"); //이거도 메소드
		display(); //소문자()의 형태로 메소드 유추 가능
		hello(20);
		hello(30); //메소드는 여러번 호출 가능
		System.out.println("프로그램 종료");
	}
//	메인 메소드만 읽는다
//  클래스 안에는 많은 메소드 생성 가능
//	클래스 = 속성
//	메소드 = 기능
//	메소드를 쓰는 이유 : 유지보수 용이
	public static void display() {		//메인메소드(static 메소드)가 있는 파일에서는 static메소드를 선언해야함
		System.out.println("메소드 실행");
	}
	
	public static void hello(int age) { 
		//age라는 매개변수에 20이라는 값이 들어옴
		//이 메소드에서는 정수선언이 되어있어 메인메소드에서 출력할때 매개변수에 정수를 입력해야함
		System.out.println("제 나이는 " + age + "입니다.");
	}
	
	

}
