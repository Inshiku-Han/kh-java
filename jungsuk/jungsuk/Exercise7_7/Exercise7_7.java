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
		this(200); // �Ű����� ������ ȣ��
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
		this(1000); // �Ű����� ������ ȣ��
	}

	Child(int x) {
		//super(); ȣ�� : ���� ������ ȣ�� ���ϸ� super()�ڵ� ȣ��
		this.x = x;
	}
}