package method;

import java.util.Scanner;

public class Exam24 {
public static void main(String[] args) {
	// scanner�� �Է¹��� �� ������ �Ű������� �޾�, �� ������ ���� �����ϴ� �޼ҵ带 �����ϰ� ȣ���Ͽ� ����� ȣ�����غ�����.
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.println(multi(a, b));
	sc.close();
}

public static int multi(int a, int b) {
	return a * b;
	
}
}
