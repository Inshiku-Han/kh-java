package test1;

public class A {
	private int a = 10;
	int b = 20;
	  String name = "java";

	
	
	@Override // ������̼�(@�� �ܾ�) : �������� ��ȿ�� �˻�. �Ǽ��� ������
	public String toString() { // alt+shift+s -> Generate toString -> field ������ Generate
		return "A [a=" + a + ", b=" + b + ", name=" + name + "]";
	}

	public void display() {
		toString(); //�����Ǿ��ִ�
		System.out.println(b + " = " + a);
		System.out.println(b + " = " + b);
		System.out.println(name + " = " + name);
	}
}
