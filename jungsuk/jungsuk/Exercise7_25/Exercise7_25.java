package Exercise7_25;

public class Exercise7_25 {
public static void main(String[] args) {
	Outer outer = new Outer();
	Outer.Inner inner = outer.new Inner(); // Inner�� public �޼���
	System.out.println(inner.iv);
}
}
