package fieldClass;

public class Student {
//	7. Student 클래스는 이름, 나이, 주소, 학번, 연락처를 멤버로 가지고 있습니다.
//	각각의 멤버를 선언하고 모든 멤버를 초기화 하는 메소드를 만드세요.
//	8. Student 클래스에서 멤버 각각의 값을 변경하는 메소드를 만드세요.
//	9. Student 클래스에서 각각의 멤버 값을 리턴하는 메소드를 만드세요.
//	10. Student 클래스에 모든 멤버의 값을 출력하는 메소드를 만드세요.
	String name;
	int age;
	String adress;
	int schoolNumber;
	int phoneNumber;
	
	public Student() {
		name = null;
		age = 0;
		adress = null;
		schoolNumber = 0;
		phoneNumber = 0;
	}
	
	public void set(String name, int age, String adress, int schoolNumber, int phoneNumber) {
		
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.schoolNumber = schoolNumber;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAdress() {
		return this.adress;
	}
	public int getSchoolNumber() {
		return this.schoolNumber;
	}
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	public void display() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("주소 : " + this.adress);
		System.out.println("학번 : " + this.schoolNumber);
		System.out.println("연락처 : " + this.phoneNumber);
	}
	
	
	
}
