package day08;

public class Child2 extends Parent2{
	private String name;
	
	public Child2() {
		this("홍길동"); // super()와 this()는 같이 못쓴다. 이 메소드에는 super()가 없다
		System.out.println("Child2() call");
		
	}
	public Child2(String name) {
		super(); // 이 메소드에는 super()가 있다. 상속하면 항상 있다.
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
