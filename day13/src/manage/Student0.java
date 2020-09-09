package manage;

public class Student0 {
	//학생 클래스는 이름, 나이, 학점(A,B,C...), 연락처 정보를 가지고 있다.
	private String name;
	private int age;
	private String grade;
	private String adress;
	public Student0() {
	}
	public Student0(String name, int age, String grade, String adress) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
