package person;

public class Person {
	private String name;
	private int age;
	
	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void getInfo() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
	}
}
