package day08;

public class Parent {
	String name;
	
	public Parent() { // 기본생성자 필요
		
	}
	
	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent{
	int studentNo;
	
	public Child() {
		
	}
	
	public Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
}
