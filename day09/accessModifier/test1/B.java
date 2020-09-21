package test1;

public class B {
	public static void main(String[] args) {
		A a = new A();
		a.display();
		System.out.println(a.toString());
		System.out.println(a); // toString메소드가 있을 때는 객체a를 출력하면 toString메소드를 출력해준다. (원래 객체 출력 안됨)

	}
}
