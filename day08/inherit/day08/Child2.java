package day08;

public class Child2 extends Parent2{
	private String name;
	
	public Child2() {
		this("ȫ�浿"); // super()�� this()�� ���� ������. �� �޼ҵ忡�� super()�� ����
		System.out.println("Child2() call");
		
	}
	public Child2(String name) {
		super(); // �� �޼ҵ忡�� super()�� �ִ�. ����ϸ� �׻� �ִ�.
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
