package polymorphism;

public class Cat implements Animal{
	public void sound() { // �������̵� : �θ��� �޼ҵ�� �̸��� ���� �Ѵ�.
		System.out.println("�߿�");
	}
}

class Dog implements Animal{
	public void sound() {
		System.out.println("�۸�");
	}

}

class Cow implements Animal{
	public void sound() {
		System.out.println("����");
	}

}