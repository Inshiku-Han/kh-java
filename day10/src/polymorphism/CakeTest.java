package polymorphism;

public class CakeTest {
	public static void main(String[] args) {
		Cake c1 = new Cake(); // �ڱ� �ڽ�
		Cake c2 = new CheeseCake(); // �θ� �ڽ�
		Cake c3 = new StrawberryCheeseCake(); // �θ� �ڽ� �ڽ�
		
		CheeseCake c4 = new CheeseCake(); // �ڱ� �ڽ�
		CheeseCake c5 = new StrawberryCheeseCake(); // �θ� �ڽ�
		
		StrawberryCheeseCake c6 = new StrawberryCheeseCake(); // �ڱ� �ڽ�
		
		//����ȯ
		CheeseCake c7 = new CheeseCake();
		Cake c8 = c7;
		StrawberryCheeseCake c9 = (StrawberryCheeseCake)c7;
		c9.sour(); // ����ȯ�ϸ� �ش� Ŭ������ �޼ҵ� ��� ����
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
