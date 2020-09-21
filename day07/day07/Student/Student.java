package Student;

public class Student {
	//	2020-07-01 메소드 오버로딩 / 생성자 / 접근제어어
	//	메소드 오버로딩 : 하나의 클래스에 같은 이름의 메서드를 여러 개 정의하는 것
	//	오버로딩의 조건 : 메서드 이름 같아야함. 매개변수의 갯수나 타입이 달라야함
	//	매개변수의 이름은 같아야 함
	//	면접에서 자주 물어봄
	//	클래스끼리 공유할 수 있는 변수 : 클래스 변수(static 변수)
	
	
	
	//	멤버
	String name;
	int age;
	String grade;
	
	public Student() { // 생성자도 오버로딩 가능
		name = null;
		age = 0;
		grade = null;
	}
	public Student(String a){ //기본값을 넣고 시작하고 싶을 때
		name = a;
		age = 0;
		grade = null;
		
	}
	
	//	학생정보를 입력하는 메소드
	public void setInfo(String name) {
		this.name = name;
	}
	
	public void setInfo(String name, int age, String grade) { // 메소드명이 같아도 매개변수가 다르면 메소드명 중복 허용
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	
	
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성적 : " + grade);
	}
}
