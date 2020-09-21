package method;

public class Exam40 {

	public static void main(String[] args) {
		// 8. 정수형 배열 두 개를 매개변수로 받아 두 배열의 모든 요소를 갖는 새로운 배열을 리턴하는 메소드를 만들고 호출해보세요.
		int[] a = { 1, 3, 5 };
		int[] b = { 2, 4, 6 };
		int[] c = list(a, b);
		for (int e : c) { //c배열을 e 배열 각각에 넣어 차례대로 출력
			System.out.print(e);

		}
	}

	public static int[] list(int[] a, int[] b) {
		int[] x = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			x[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			x[i + a.length] = b[i];

		}
		return x;
	}
}
