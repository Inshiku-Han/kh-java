package instanceOf;

public class Car {
	String color;
	int door;
	
	public void drive() {
		System.out.println("drive");
		
	}
	public void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	public void water() {
		System.out.println("water");
	}
}
class Ambulance extends Car{
	public void siren() {
		System.out.println("siren");
	}
}