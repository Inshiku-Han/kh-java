package method;

public class Exam33 {
	public static void main(String[] args) {
		// 2. 정수 하나를 매개변수로 받아 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해보세요.

		gugu(5);
	}

	public static void gugu(int a) {
		for (int i = 1; i < 10; i++) {

			System.out.print(a + "*" + i + "=" + a * i);
			System.out.print(" ");

		}
	}
}
