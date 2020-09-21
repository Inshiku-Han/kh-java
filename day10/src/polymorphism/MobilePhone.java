package polymorphism;

public class MobilePhone {
	String number; // Æù ³Ñ¹ö

	public MobilePhone() {
		
	}
	public MobilePhone(String number) {
		this.number = number;
	}
	
	public void answer() {
		System.out.println("Hi! from" + number);
	}
	
}
