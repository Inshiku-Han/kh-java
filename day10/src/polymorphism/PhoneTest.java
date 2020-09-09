package polymorphism;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("010-1111-1111", "Nougat");
		phone1.answer();
		phone1.playApp();

//		SmartPhone phone2 = new MobilePhone("010-2222-2222"); 자식클래스로 부모클래스 생성 x
		MobilePhone phone3 = new SmartPhone("010-2222-2222", "Nougat"); // 부모클래스로 자식클래스 생성 o
		
		phone3.answer();
//		phone3.playApp();	부모클래스로 자식클래스를 생성해도 자식의 메소드 사용 불가. 사용하려면 오버라이딩 필요.
		
			

	}

}
