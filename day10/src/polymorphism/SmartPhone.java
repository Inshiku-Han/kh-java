package polymorphism;

public class SmartPhone extends MobilePhone{
	String androidVer;
	
	public SmartPhone(String num, String androidVer) {
		super(num);
		this.androidVer = androidVer;
		
	}
	
	public void playApp() {
		System.out.println("App is running...");
	}
	
}
