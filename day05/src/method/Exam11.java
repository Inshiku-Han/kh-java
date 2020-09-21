package method;

public class Exam11 {
public static void main(String[] args) {
	//7. 두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해보세요.
	val(10, 3);
}
public static void val(int a, int b) {
	System.out.println("몫 : " + a/b);
	System.out.println("나머지 : " + a%b);
}
}
