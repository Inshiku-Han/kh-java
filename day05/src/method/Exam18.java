package method;

public class Exam18 {
public static void main(String[] args) {
	//15. �� ������ �Ű������� �޾�, �� ������ ��� ¦���̸� ���� ���� ¦���Դϴ�.���� ����ϰ�, 
	//�� ������ ¦���� ��� ���� ���� ¦���Դϴ�.����, �� �� ��� Ȧ���� ���� ���� ���� Ȧ���Դϴ�.��
	//�� ����ϴ� �޼ҵ带 �����ϰ� ȣ���غ�����.
	
	judge(3, 3);
}

public static void judge(int a, int b) {
	if(a % 2 == 0 && b % 2 == 0) {
		System.out.println("�� ���� ¦���Դϴ�.");
	} else if(a % 2 == 1 && b % 2 == 1) {
		System.out.println("�� ���� Ȧ���Դϴ�.");
		
	} else if(a % 2 == 0 || b % 2 == 0) {
		System.out.println("�� ���� ¦���Դϴ�.");
	}
}
}
