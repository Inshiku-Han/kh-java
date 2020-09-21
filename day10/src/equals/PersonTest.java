package equals;
	// ���� �� ��
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("�Ӳ���", 30);
		Person p3 = new Person("ȫ�浿", 20);

		if (p1.equals(p3)) {
			System.out.println("p1�� p3�� �����ϴ�");
		} else {
			System.out.println("p1�� p3�� �ٸ��ϴ�");
		}
		String s1 = "abc";
		s1.contentEquals("abc"); // .�տ� �� �� �ִ°� Ŭ������
		System.out.println(p3.toString());
		System.out.println(p3);
	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Person s = (Person) obj; // ������Ʈ�� �Ű������� �������� ����ȯ �������
		if (name.equals(s.name)) {
			return true;
		} else {
			return false;
		}
	}

}
