package method;

public class Exam30 {
	public static void main(String[] args) {
		// 8. 세 정수를 매개변수로 받아, 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.

		System.out.println(avg(3, 4, 5));
	}

	public static double avg(int a, int b, int c) {

		return (a + b + c) / 3.0;
	}
}
