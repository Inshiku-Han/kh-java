package day13;

public class Student1 {
	private Person person; // Ŭ������ ��������� ����
	private Sungjuk sungjuk;
	
	public Student1() {
		person = new Person(); // Ŭ������ ��������� ������ ��� ������ ��ü�������� �ʱ�ȭ �������
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

