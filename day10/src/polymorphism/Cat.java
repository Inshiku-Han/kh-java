package polymorphism;

public class Cat implements Animal{
	public void sound() { // 오버라이딩 : 부모의 메소드와 이름을 같게 한다.
		System.out.println("야옹");
	}
}

class Dog implements Animal{
	public void sound() {
		System.out.println("멍멍");
	}

}

class Cow implements Animal{
	public void sound() {
		System.out.println("음메");
	}

}