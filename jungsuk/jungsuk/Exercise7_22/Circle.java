package Exercise7_22;

public class Circle extends Shape {
	double r; // 반지름

	public Circle(double r) {
		this(new Point(0, 0), r);
	}

	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return this.r * this.r * Math.PI;
	}

}

class Rectangle extends Shape {
	double width; // 폭
	double height; // 높이

	public Rectangle(double width, double height) {
		this(new Point(0, 0), width, height);
	}

	public Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return this.width * this.height;
	}

	boolean isSquare(Shape s) {
		return width * height != 0 && width == height;
	}
}