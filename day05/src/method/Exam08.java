package method;

public class Exam08 {
	public static void main(String[] args) {
//		int a = 10;
//		System.out.println(a);
//		setValue(a);
//		System.out.println(a);
		
		int[] a = {1};
		System.out.println(a[0]);
		setValue1(a);
		System.out.println(a[0]); //�迭������ ����=�ּ��̵��� ����.
	}
	
	
	public static void setValue(int a) { //�� �޼ҵ忡�� ���̴� int a�� �� �޼ҵ忡�� ���̴� int a�� �ٸ�
		a = a+1;
		System.out.println(a);
	}
	public static void setValue1(int[] a) {
		a[0] = a[0] + 1;
		System.out.println(a[0]);
	}
}
