package MultipleClass;

public class PersonInfo {
	private String name;
	private int age;
	private String address;
	
	public PersonInfo(){
		
	}
	public void setPersonInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void displayPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
}
