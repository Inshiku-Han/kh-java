package method;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		//13. scanner�� ���� �� ���� �Է¹޾�, 
		//�Է¹��� �� ���� �Ű������� ����Ͽ� �� ���� ���� ����ϴ� �޼ҵ带 �����ϰ�, ȣ���غ�����.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum(a, b);
		
		sc.close();
	}
public static void sum(int a, int b) {
	int sum = a + b;
	System.out.println("�� ���� ���� " + sum + "�Դϴ�.");
}
}
