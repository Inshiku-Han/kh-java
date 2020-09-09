package Exercise7_27;

public class Exercise7_27 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		
		
		inner.method1();
	}

}
