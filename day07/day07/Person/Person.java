package Person;

public class Person {
	String name;
	int age;

	// 임의의 생성자를 만들 경우 디폴트 생성자는 자동생성되지 않는다. 디폴트 생성자가 필요하면 따로 생성해줘야함. 따로 만들어 주는 것이 좋다

	public Person() {
		name = null;
		age = 20;
	}

	public Person(String name) {
		this(); // 디폴트 생성자 호출. 이 경우 위에 name = null; age = 20;을 호출
		this.name = name;

	}

	public Person(String name, int age) {
		this(name); // name 변수를 갖는 생성자 호출. 항상 생성자 내에 처음으로 작성해야함
		this.age = age;
	}

	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
