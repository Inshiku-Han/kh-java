package Exercise7_25;

public class Exercise7_25 {
public static void main(String[] args) {
	Outer outer = new Outer();
	Outer.Inner inner = outer.new Inner(); // Inner가 public 메서드
	System.out.println(inner.iv);
}
}
