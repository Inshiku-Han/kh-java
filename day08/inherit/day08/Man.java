package day08;

public class Man {
	 String name; // ����� private�̸� �ڽ��� ���� �Ұ�. ����� ����
	
	public Man(){
		System.out.println("Man ������ ȣ��");
	}
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
	
}


class BusinessMan extends Man{ // ����Ͻ����� ���� ���
	String company;
	String position;
	public BusinessMan() {
		super(); // ��ӹ��� ������ ȣ��. ����� �����Ǿ��ִ�.
		System.out.println(this.company);
		System.out.println(super.name); // �� �Ⱦ�. �ʵ�� privateȭ �Ǳ� ����
		System.out.println("BusinessMan ������ ȣ��");
	}
	
	public void tellYourInfo() {
		System.out.println("My Company is " + company);
		System.out.println("My Position is " + position);
		tellYourName();
//		System.out.println(name); ������ private�̸� ���ٺҰ�
	}
}


