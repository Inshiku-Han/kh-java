package method;

public class Exam13 {
public static void main(String[] args) {
	//9. �̸��� �Ű������� �޾� �̸��� ����ϴ� �޼ҵ�, ���̸� �Ű������� �޾� ���̸� ����ϴ� �޼ҵ�, 
	//�ּҸ� �Ű������� �޾� �ּҸ� ����ϴ� �޼ҵ带 ���� ����� ��°���� �Ʒ��� ���� ���α׷����ϼ���.
//	- ��°�� ����-
//	�̸��� �������Դϴ�.
//	���̴� 33���Դϴ�.
//	�ּҴ� ����Դϴ�.
	name("���ν�");
	age(26);
	adress("���");
}
public static void name(String a) {
	System.out.println("�̸��� " + a + "�Դϴ�.");
}
public static void age(int a) {
	System.out.println("���̴� " + a + "�Դϴ�.");
}
public static void adress(String a) {
	System.out.println("�ּҴ� " + a + "�Դϴ�.");
}
}
