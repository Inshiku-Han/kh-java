package for_while;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		2���� ��鿡�� �ϳ��� ���簢���� �� ������ ǥ���ȴ�.
//		(50, 50)�� (100, 100)�� �� ������ �̷���� �簢���� �ִٰ� ����.
//		�̶� Ű����κ��� �� ���� �����ϴ� ���� x��y���� �Է¹ް�
//		��(x,y)�� �� ���簢�� �ȿ� �ִ����� �Ǻ��ϴ� ���α׷� ������
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		System.out.print("x�� , y�� = ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x >=50 && x <= 100) {
			if(y >= 50 && y <= 100) {
				System.out.println("���簢�� �ȿ� �ִ�");
		}
		}else {
			System.out.println("���簢�� �ȿ� ����");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
