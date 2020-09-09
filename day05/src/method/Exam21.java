package method;

public class Exam21 {
	public static void main(String[] args) {
		// 18. 두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고 호출해보세요.
		
		multi(1, 19);
	}

	public static void multi(int a, int b) {
		int sum = 0;
		for(int i = a; i < b; i++) {
			if(i % 5 == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
