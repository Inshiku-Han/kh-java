package fieldClass;

//�̸�, ����
//�̸�, ���̸� ���� ������ �� �ִ� �޼ҵ�(setter) �Ű��������
//�̸�, ���̰��� �о���� �޼ҵ�(getter) ���ϻ��
//�̸�, ���̸� ����ϴ� �޼ҵ�
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
		System.out.println("�̸� : " + getName()); //getter ���
		System.out.println("���� : " + getAge()); //getter ���
	}
}
