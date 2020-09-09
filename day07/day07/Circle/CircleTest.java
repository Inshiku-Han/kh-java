package Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		// c.r 여기 클래스에서는 읽을 수 없음
		c.setR(-10);
		System.out.println(c.getR());
		c.display();
	}
}
