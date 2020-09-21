package exception;


import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//예외가 일어날 것 같은 코드 작성
			System.out.print("숫자입력 : ");
			int a = sc.nextInt();
			System.out.println("a = " + a);
		}catch(Exception e) {
			//예외 발생 시 실행할 코드
		System.out.println("예외가 발생했습니다.");
		}
//		
//		System.out.println("프로그램이 정상 종료되었습니다.");

//		Exception e 는 모든 Exception 클래스의 조상(종속)
//		try {
//			System.out.println(5/0);
//		}catch(Exception e) {
//			System.out.println(e.getMessage()); // 오류 내용 출력
//			System.out.println();
////			e.printStackTrace(); // 오류 출력. try-catch에서는 오류문구가 발생하지 않아 이 메소드로 실행해야한다.
//		}
//		System.out.println("정상 종료");
		sc.close();
	}

}
