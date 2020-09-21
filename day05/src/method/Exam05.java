package method;

public class Exam05 {

	public static void main(String[] args) {
//		divide(4, 2);
//		divide(6, 2); // 메소드 자동완성 - 입력 - 탭 - 입력 - 엔터
//		divide(9, 0);
		
//		couple(99);
//		couple(100);
		
		System.out.println(hole(10));
		System.out.println(hole(11));
	
	}
	
	// 나눗셈 결과를 출력하는 메소드

	public static void divide(int a, int b) {
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; // return해야 나머지 실행을 막을 수 있다. break와 같은 기능
		}
		System.out.println("나눗셈 결과는 : " + (a / b));
	}
	
	//매개변수로 정수를 받아, 해당 매개변수가 짝수면 '짝수입니다', 홀수면 '홀수입니다'를 출력하는 메소드
	
	public static void couple(int c) {
			String result = null;
//		if(c % 2 == 0) {
//			result = "짝수";
//		} else {
//			result = "홀수";
//		}
			result = c % 2 == 0 ? "짝수" : "홀수"; //삼항연산자
		System.out.println(result + "입니다.");
	}
	//매개변수로 정수를 받아, 해당 매개변수가 짝수면 '짝수입니다', 홀수면 '홀수입니다'를 리턴하는 메소드
	
	public static String hole(int x) {
		String result = null;
		
		if(x % 2 == 0 ) {
			result = "짝수";
		} else{
			result = "홀수";	
		}
		return result; //리턴은 한번만 사용

//		return x % 2 == 0 ? "짝수" : "홀수";
		
	}
}