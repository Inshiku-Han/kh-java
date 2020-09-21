package day08;

public class SnowTireExample {
public static void main(String[] args) {
	SnowTire snowTire = new SnowTire();
	Tire tire = snowTire;
	
	snowTire.run();
	tire.run(); // snowTire 클래스 안의 메소드가 오버라이딩 되었다
}
}
