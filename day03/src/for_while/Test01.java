package for_while;

public class Test01 {

	public static void main(String[] args) {
		int a1 = 50;
		int b1 = 50;
		int c1 = a1 + b1;

		if (c1 > 50) {
			System.out.println("�� ���� ���� 50���� Ů�ϴ�");
		} else {
			System.out.println("�� ���� ���� 50���� �۽��ϴ�");
		}

		int a2 = 3;

		if ((a2 % 2) == 0) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}

		int a3 = 0;
		int b3 = 0;

		if (a3 > b3) {
			System.out.println("a�� Ů�ϴ�");
		} else if (a3 < b3) {
			System.out.println("b�� Ů�ϴ�");
		} else {
			System.out.println("�����ϴ�");
		}
		
		int a4 = 0;
		
		if((a4 % 3) == 0) {
			System.out.println("3�� ����Դϴ�");
		}
		
		int a5 = 77;
		
		if(a5 > 90 && a5 <= 100) {
			System.out.println("������ A�Դϴ�");
		}else if (a5 > 80) {
			System.out.println("������ B�Դϴ�");
		}else {
			System.out.println("������ C�Դϴ�");
		}
	}
}
