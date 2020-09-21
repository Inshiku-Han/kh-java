package polymorphism;

public class CakeTest {
	public static void main(String[] args) {
		Cake c1 = new Cake(); // 자기 자신
		Cake c2 = new CheeseCake(); // 부모 자식
		Cake c3 = new StrawberryCheeseCake(); // 부모 자식 자식
		
		CheeseCake c4 = new CheeseCake(); // 자기 자신
		CheeseCake c5 = new StrawberryCheeseCake(); // 부모 자식
		
		StrawberryCheeseCake c6 = new StrawberryCheeseCake(); // 자기 자신
		
		//형변환
		CheeseCake c7 = new CheeseCake();
		Cake c8 = c7;
		StrawberryCheeseCake c9 = (StrawberryCheeseCake)c7;
		c9.sour(); // 형변환하면 해당 클래스의 메소드 사용 가능
	}
}

class Cake {
	public void sweet() {
		System.out.println("sweet...");
	}
}

class CheeseCake extends Cake {
	public void milky() {
		System.out.println("milky...");
	}
}

class StrawberryCheeseCake extends CheeseCake {
	public void sour() {
		System.out.println("sour...");
	}
}
