package fieldClass;
	//	�̸� ���̵� �н����� ����
public class Member2 {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member2() {
		
	}
	public Member2(String name, String id) {
		this();
		this.name = name;
		this.id = id;
	}
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		System.out.println(age);
	}
}
