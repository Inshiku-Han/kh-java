package method;

public class Exam02 {
	public static void main(String[] args) {
		hello(26, 170.3); //�Ű������� �ڷ����� ���������
		
		
		int a =30;
		double b = 180.5;
		hello(a,b); //������ �̿��ϴ� �͵� ����   �޼ҵ�� �ڵ��ϼ� ����
	}

	public static void hello(int age, double height) { //�Ű������� �ΰ��� �޼ҵ�
		System.out.println("�� ���̴� " + age);
		System.out.println("Ű�� " + height);
	}
}
