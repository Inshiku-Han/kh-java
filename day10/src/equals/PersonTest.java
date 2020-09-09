package equals;
	// 깊이 볼 것
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("임꺽정", 30);
		Person p3 = new Person("홍길동", 20);

		if (p1.equals(p3)) {
			System.out.println("p1과 p3는 같습니다");
		} else {
			System.out.println("p1과 p3는 다릅니다");
		}
		String s1 = "abc";
		s1.contentEquals("abc"); // .앞에 올 수 있는건 클래스뿐
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
		Person s = (Person) obj; // 오브젝트를 매개변수로 받으려면 형변환 해줘야함
		if (name.equals(s.name)) {
			return true;
		} else {
			return false;
		}
	}

}
