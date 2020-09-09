package method;

public class Exam14 {
public static void main(String[] args) {
	//10. 위의 문제를 하나의 메소드를 사용하여 출력결과가 같게 프로그래밍 해보세요.
	sum("한인식", 26, "울산");
}
public static void sum(String a, int b, String c) {
	System.out.println("이름은 " + a + "입니다.");
	System.out.println("나이는 " + b + "입니다.");
	System.out.println("주소는 " + c + "입니다.");
}
}
