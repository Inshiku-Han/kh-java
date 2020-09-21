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
		c12.eat(); // �������� �������̵��� ���� ����ϸ� �ڽ��� �޼ҵ� ��밡��. ���� ��Ű������ ���׽�Ʈ�� ���غ���
	}
}

class Cake1 {
	public void eat() {
		System.out.println("����ũ�� �Դ´�.");
	}
}

class CheeseCake1 extends Cake1 {
	public void eat() {
	
		System.out.println("ġ������ũ�� �Դ´�."); // �޼ҵ� �������̵�
	}
}