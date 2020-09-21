package day13;

public class Student1 {
	private Person person; // 클래스를 멤버변수로 선언
	private Sungjuk sungjuk;
	
	public Student1() {
		person = new Person(); // 클래스를 멤버변수로 선언한 경우 무조건 객체생성으로 초기화 해줘야함
		sungjuk = new Sungjuk();
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	public Person getPerson() {
		return person;
	}
	public void setSungjuk(Sungjuk sungjuk) {
		this.sungjuk = sungjuk;
	}
	public Sungjuk getSungjuk() {
		return sungjuk;
	}
}

