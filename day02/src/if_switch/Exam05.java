package if_switch;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		//���� �ϳ��� �Է¹޾� �Է¹��� ���� 10���� ũ��
		//*�� ����ϰ�, 10���� ������ !�� ����ϰ�, 10�� ������ @�� ���
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.print("�Է� : ");
		a = sc.nextInt();
		
		if(a > 10) {
			System.out.println("*");
		}else if(a < 10){
			System.out.println("!");
		}else {
			System.out.println("@");
		}
		sc.close();
	}
}
