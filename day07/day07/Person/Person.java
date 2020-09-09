package Person;

public class Person {
	String name;
	int age;

	// ������ �����ڸ� ���� ��� ����Ʈ �����ڴ� �ڵ��������� �ʴ´�. ����Ʈ �����ڰ� �ʿ��ϸ� ���� �����������. ���� ����� �ִ� ���� ����

	public Person() {
		name = null;
		age = 20;
	}

	public Person(String name) {
		this(); // ����Ʈ ������ ȣ��. �� ��� ���� name = null; age = 20;�� ȣ��
		this.name = name;

	}

	public Person(String name, int age) {
		this(name); // name ������ ���� ������ ȣ��. �׻� ������ ���� ó������ �ۼ��ؾ���
		this.age = age;
	}

	public void display() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
