package method;

public class Exam39 {
	public static void main(String[] args) {
		// 7. 문자열 배열을 매개변수로 받아 배열에 저장된 모든 문자열을 나열하여 리턴하는 메소드를 만들고 호출해보세요.
		String[] a = { "아", "이", "우", "에", "오" };
		System.out.print(name(a));

	}

	public static String name(String[] a) {
		String b = ""; //null말고 빈공간
		for (int i = 0; i < a.length; i++) {
			b = b + a[i];

		}
		return b;
	}
}
