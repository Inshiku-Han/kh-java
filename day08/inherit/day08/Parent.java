package day08;

public class Parent {
	String name;
	
	public Parent() { // �⺻������ �ʿ�
		
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
