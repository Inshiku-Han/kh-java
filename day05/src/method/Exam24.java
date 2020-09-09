package method;

import java.util.Scanner;

public class Exam24 {
public static void main(String[] args) {
	// scanner로 입력받은 두 정수를 매개변수로 받아, 두 정수의 곱을 리턴하는 메소드를 선언하고 호출하여 결과를 호학인해보세요.
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
