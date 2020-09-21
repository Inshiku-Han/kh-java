package study;

public class While01 {

	public static void main(String[] args) {
		//while문이 끝나도 도와주는 변수가 사라지지 않는다.
		int a = 0;
		while(a < 10) {
		a++;
			System.out.print(a + " ");
		}
		System.out.println();
		
		int b = 0;
		while(b < 10) {
		++b;
			System.out.print(b + " ");
		}
		System.out.println();
		
		int c = 0;
		while(c < 10) {
			System.out.print(c++ + " "); // 먼저
		}
		System.out.println();
		
		int d = 0;
		while(d < 10) {
			System.out.print(++d + " "); // 나중
			}
		}

}
