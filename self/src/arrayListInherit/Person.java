package arrayListInherit;

// Person 클래스는 이름, 나이, 값
// Sungjuk 클래스는 국어, 영어, 수학, 총점, 평균
// Student1 클래스는 이름, 나이, 국어, 영어, 수학 점수
public class Person {
	private String name;
	private	int age;
	
	public Person() {}

	//setter, getter
	//모든 변수에 데이터를 설정하는 메소드
	//모든 정보를 출력하는 메소드(toString)
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
	public void setPersonInfo(String name, int age){
		setName(name);
		setAge(age);
	}
	@Override
	public String toString() {
		return "Person [name=" + getName() + ", age=" + getAge() + "]";
	}
	
}
