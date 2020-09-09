package test1;

public class A {
	private int a = 10;
	int b = 20;
	  String name = "java";

	
	
	@Override // 어노테이션(@들어간 단어) : 데이터의 유효성 검사. 실수를 막아줌
	public String toString() { // alt+shift+s -> Generate toString -> field 선택후 Generate
		return "A [a=" + a + ", b=" + b + ", name=" + name + "]";
	}

	public void display() {
		toString(); //생략되어있다
		System.out.println(b + " = " + a);
		System.out.println(b + " = " + b);
		System.out.println(name + " = " + name);
	}
}
