package Student;

public class Student {
	//	2020-07-01 �޼ҵ� �����ε� / ������ / ���������
	//	�޼ҵ� �����ε� : �ϳ��� Ŭ������ ���� �̸��� �޼��带 ���� �� �����ϴ� ��
	//	�����ε��� ���� : �޼��� �̸� ���ƾ���. �Ű������� ������ Ÿ���� �޶����
	//	�Ű������� �̸��� ���ƾ� ��
	//	�������� ���� ���
	//	Ŭ�������� ������ �� �ִ� ���� : Ŭ���� ����(static ����)
	
	
	
	//	���
	String name;
	int age;
	String grade;
	
	public Student() { // �����ڵ� �����ε� ����
		name = null;
		age = 0;
		grade = null;
	}
	public Student(String a){ //�⺻���� �ְ� �����ϰ� ���� ��
		name = a;
		age = 0;
		grade = null;
		
	}
	
	//	�л������� �Է��ϴ� �޼ҵ�
	public void setInfo(String name) {
		this.name = name;
	}
	
	public void setInfo(String name, int age, String grade) { // �޼ҵ���� ���Ƶ� �Ű������� �ٸ��� �޼ҵ�� �ߺ� ���
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	
	
	public void display() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + grade);
	}
}
