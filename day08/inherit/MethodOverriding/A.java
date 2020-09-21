package MethodOverriding;

public class A {
	private int x;
	private int y;

	public A() {
		x = 1;
		y = 1;
	}

	public A(int num) {
		this(); // 현재 클래스의 기본 생성자 호출
		this.x = num;
	}
	public A(int num1, int num2) {
		this(num1);
		this.y = num2;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

}

class B extends A {
	private int x;
	private int y;

	public B() {
		x = 1;
		y = 1;
	}

	public B(int num) {
		super(num); //부모클래스의 매개변수 생성자 호출
		this.x = 1;
		this.y = 1;
	}
	public B(int num1, int num2) {
		super(num1, num2); //부모클래스의 매개변수 생성자 호출
		this.x = 1;
		this.y = 1;
	}
	public B(int num1, int num2, int num3) {
		super(num1, num2);
		this.x = num3;
		this.y = 1;
	}
	public B(int num1, int num2, int num3,int num4) {
		super(num1, num2);
		this.x = num3;
		this.y = num4;
	}

	public void disp() {
		System.out.println("x = " + getX() + ", y = " + getY() + ", x = " + x + ", y = " + y);
	}
}
