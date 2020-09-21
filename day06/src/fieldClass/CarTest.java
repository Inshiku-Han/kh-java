package fieldClass;

public class CarTest {
public static void main(String[] args) {
	Car c = new Car(); // Car 객체생성
	c.setBrand("현대");
	c.setName("아반떼");
	c.setNumber(1111);
	c.setPrice(100);
	c.setOwner("자바");
	
	
	c.display();
}
}
