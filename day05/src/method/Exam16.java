package method;

import java.util.Scanner;

public class Exam16 {
public static void main(String[] args) {
	//12. 10�� ������ Ǯ���ٸ�, 10�� �������� �Ű������� �޴� �̸�, ����, �ּҸ� scanner�� ���� �Է����� �ٲپ� Ǯ�����.
	Scanner sc = new Scanner(System.in);
	String a = null;
	int b = 0;
	String c = null;
	
	a = sc.nextLine();
	b = sc.nextInt();
	c = sc.next();
	sum(a, b, c);
	
	sc.close();
}
public static void sum(String a, int b, String c) {
	System.out.println("�̸��� " + a + "�Դϴ�.");
	System.out.println("���̴� " + b + "�Դϴ�.");
	System.out.println("�ּҴ� " + c + "�Դϴ�.");
}

}
