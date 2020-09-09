package testInterface;

public class CalcTest {
public static void main(String[] args) {
	Calc c = new Calculator(); // 인터페이스를 사용할때는 인터페이스로 객체 선언
	System.out.println(c.sum(10,20));
	
}
}
