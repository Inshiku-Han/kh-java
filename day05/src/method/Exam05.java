package method;

public class Exam05 {

	public static void main(String[] args) {
//		divide(4, 2);
//		divide(6, 2); // �޼ҵ� �ڵ��ϼ� - �Է� - �� - �Է� - ����
//		divide(9, 0);
		
//		couple(99);
//		couple(100);
		
		System.out.println(hole(10));
		System.out.println(hole(11));
	
	}
	
	// ������ ����� ����ϴ� �޼ҵ�

	public static void divide(int a, int b) {
		if (b == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return; // return�ؾ� ������ ������ ���� �� �ִ�. break�� ���� ���
		}
		System.out.println("������ ����� : " + (a / b));
	}
	
	//�Ű������� ������ �޾�, �ش� �Ű������� ¦���� '¦���Դϴ�', Ȧ���� 'Ȧ���Դϴ�'�� ����ϴ� �޼ҵ�
	
	public static void couple(int c) {
			String result = null;
//		if(c % 2 == 0) {
//			result = "¦��";
//		} else {
//			result = "Ȧ��";
//		}
			result = c % 2 == 0 ? "¦��" : "Ȧ��"; //���׿�����
		System.out.println(result + "�Դϴ�.");
	}
	//�Ű������� ������ �޾�, �ش� �Ű������� ¦���� '¦���Դϴ�', Ȧ���� 'Ȧ���Դϴ�'�� �����ϴ� �޼ҵ�
	
	public static String hole(int x) {
		String result = null;
		
		if(x % 2 == 0 ) {
			result = "¦��";
		} else{
			result = "Ȧ��";	
		}
		return result; //������ �ѹ��� ���

//		return x % 2 == 0 ? "¦��" : "Ȧ��";
		
	}
}