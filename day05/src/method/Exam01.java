package method;

public class Exam01 {

	public static void main(String[] args) { // ���� �޼ҵ�
		// 2020-06-29 ��ü����
		// String[] args ���ڿ� �迭
		System.out.println("���α׷� ����"); //�̰ŵ� �޼ҵ�
		display(); //�ҹ���()�� ���·� �޼ҵ� ���� ����
		hello(20);
		hello(30); //�޼ҵ�� ������ ȣ�� ����
		System.out.println("���α׷� ����");
	}
//	���� �޼ҵ常 �д´�
//  Ŭ���� �ȿ��� ���� �޼ҵ� ���� ����
//	Ŭ���� = �Ӽ�
//	�޼ҵ� = ���
//	�޼ҵ带 ���� ���� : �������� ����
	public static void display() {		//���θ޼ҵ�(static �޼ҵ�)�� �ִ� ���Ͽ����� static�޼ҵ带 �����ؾ���
		System.out.println("�޼ҵ� ����");
	}
	
	public static void hello(int age) { 
		//age��� �Ű������� 20�̶�� ���� ����
		//�� �޼ҵ忡���� ���������� �Ǿ��־� ���θ޼ҵ忡�� ����Ҷ� �Ű������� ������ �Է��ؾ���
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
	}
	
	

}
