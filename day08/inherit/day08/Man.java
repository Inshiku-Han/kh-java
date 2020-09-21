package day08;

public class Man {
	 String name; // 상속이 private이면 자식은 접근 불가. 상속은 가능
	
	public Man(){
		System.out.println("Man 생성자 호출");
	}
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
	
}


class BusinessMan extends Man{ // 비즈니스맨은 맨을 상속
	String company;
	String position;
	public BusinessMan() {
		super(); // 상속받은 생성자 호출. 안적어도 생략되어있다.
		System.out.println(this.company);
		System.out.println(super.name); // 잘 안씀. 필드는 private화 되기 때문
		System.out.println("BusinessMan 생성자 호출");
	}
	
	public void tellYourInfo() {
		System.out.println("My Company is " + company);
		System.out.println("My Position is " + position);
		tellYourName();
//		System.out.println(name); 변수가 private이면 접근불가
	}
}


