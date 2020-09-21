package polymorphism;

public class CakeTest2 {
	public static void main(String[] args) {
		Cake[] c1 = new Cake[10];
		c1[0] = new CheeseCake();
		c1[1] = new Cake();
		c1[2] = new StrawberryCheeseCake();

		Cake1 c10 = new Cake1();
		c10.eat();
		CheeseCake1 c11 = new CheeseCake1();
		c11.eat();
		
		Cake1 c12 = new CheeseCake1();
		c12.eat(); // 다형성과 오버라이딩을 같이 사용하면 자식의 메소드 사용가능. 같은 패키지내의 폰테스트와 비교해보라
	}
}

class Cake1 {
	public void eat() {
		System.out.println("케이크를 먹는다.");
	}
}

class CheeseCake1 extends Cake1 {
	public void eat() {
	
		System.out.println("치즈케이크를 먹는다."); // 메소드 오버라이딩
	}
}