package fieldClass;

public class Student {
//	7. Student Ŭ������ �̸�, ����, �ּ�, �й�, ����ó�� ����� ������ �ֽ��ϴ�.
//	������ ����� �����ϰ� ��� ����� �ʱ�ȭ �ϴ� �޼ҵ带 ���弼��.
//	8. Student Ŭ�������� ��� ������ ���� �����ϴ� �޼ҵ带 ���弼��.
//	9. Student Ŭ�������� ������ ��� ���� �����ϴ� �޼ҵ带 ���弼��.
//	10. Student Ŭ������ ��� ����� ���� ����ϴ� �޼ҵ带 ���弼��.
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
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("�ּ� : " + this.adress);
		System.out.println("�й� : " + this.schoolNumber);
		System.out.println("����ó : " + this.phoneNumber);
	}
	
	
	
}
