package variable;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.141592;
			//���� �������� �Է¹޾� ���� �ѷ���
			//���̸� ����ϼ���
			//���� �ѷ� = 2*PI*r
			//���� ���� = PI*r*r
			int r = 0;
			
			System.out.print("���� ������ = ");
			r = sc.nextInt();
			
			System.out.println("");
			
			double round = 2 * PI * r;
			double area = r * PI * r;
			
			System.out.println("���� �������� " + r + "��");
			System.out.println("���� �ѷ� = " + round + ", ���� ���� = " + area );
			sc.close();
	}

}
