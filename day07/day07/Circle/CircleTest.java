package Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		// c.r ���� Ŭ���������� ���� �� ����
		c.setR(-10);
		System.out.println(c.getR());
		c.display();
	}
}
