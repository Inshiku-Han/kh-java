package method;

public class Exam25 {
public static void main(String[] args) {
	//3. 두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요.
	System.out.println(num(65, 5));
}

public static int num(int a, int b) {
	
	return a > b ? a : b; //삼항연산자
}
}
