package fieldClass;

//이름, 나이
//이름, 나이를 각각 변경할 수 있는 메소드(setter) 매개변수사용
//이름, 나이값을 읽어오는 메소드(getter) 리턴사용
//이름, 나이를 출력하는 메소드
public class Person {
	String name;
	int age;
	
	public void setName(String a) { //setter
		name = a;
	}
	public void setAge(int a) { //setter
		age = a;
	}
	public String getName() { //getter
		return name;
	}
	public int getAge() { //getter
		return age;
	}
	
	public void display() {
		System.out.println("이름 : " + getName()); //getter 사용
		System.out.println("나이 : " + getAge()); //getter 사용
	}
}
