package method;

public class Exam28 {
public static void main(String[] args) {
	//6. 매개변수로 정수를 입력받아, 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.
	
	System.out.println(sum(10) + 10); // sum메소드는 문자를 리턴하여 10과 합쳐 1010이 된다.
}

public static String sum(int a) {
	
	return "" + a; // 문자열 + 정수 = 문자열 혹은 String.valueOF(a);
}
}
