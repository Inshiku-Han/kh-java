package variable;

public class Challenge01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
//		값 스위칭 전 출력
		System.out.println("a = " + a); // 10
		System.out.println("b = " + b); // 20
		
		System.out.println("");
		
		int c = b;
		b = a;
		a = c;
		
//		값 스위칭 후 출력
		System.out.println("a = " + a); // 20
		System.out.println("b = " + b); // 10
	}

}
