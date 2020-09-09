package method;

public class Exam19 {
	public static void main(String[] args) {
		// 16. 한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는 메소드를 선언하고 호출해보세요.

		int[] a = new int[5]; // 숫자입력
		arr(a);

	}

	public static void arr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.println(a[i]);
		}
	}
}
