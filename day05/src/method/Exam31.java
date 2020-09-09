package method;

public class Exam31 {

	public static void main(String[] args) {
		// 9. 한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.

		System.out.println(odd(6));
	}

	public static int odd(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
