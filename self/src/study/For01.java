package study;

public class For01 {

	public static void main(String[] args) {
		//for문 안에서 정의된 변수는 for문이 끝나면 메모리에서 사라진다.
		for(int a = 0; a < 10; a++) { // 먼저
			System.out.print(a + " ");
			}
		System.out.println();
		for(int b = 0; b < 10; ++b) {// 나중
			System.out.print(b + " ");
			}
		System.out.println();
		for(int c = 0; c < 10; ) {
			System.out.print(c++ + " ");
			}
		System.out.println();
		for(int d = 0; d < 10; ) {
			System.out.print(++d + " ");
			}
		
		}
	}
