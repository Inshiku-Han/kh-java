package Exercise7_26;

public class Exercise7_26 {
public static void main(String[] args) {
	Outer.Inner inner = new Outer.Inner(); // Inner가 static 메서드
	
	System.out.println(inner.iv);
	
}
}
