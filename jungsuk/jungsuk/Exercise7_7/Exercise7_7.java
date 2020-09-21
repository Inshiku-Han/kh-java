package Exercise7_7;

public class Exercise7_7 {
	public static void main(String[] args) {

		Child c = new Child();

		System.out.println("x = " + c.getX());
	}

}

class Parent {
	int x = 100;

	Parent() {
		this(200); // 매개변수 생성자 호출
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}

}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000); // 매개변수 생성자 호출
	}

	Child(int x) {
		//super(); 호출 : 따로 생성자 호출 안하면 super()자동 호출
		this.x = x;
	}
}