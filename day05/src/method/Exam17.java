package method;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		//13. scanner로 정수 두 개를 입력받아, 
		//입력받은 두 수를 매개변수로 사용하여 두 수의 합을 출력하는 메소드를 선언하고, 호출해보세요.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum(a, b);
		
		sc.close();
	}
public static void sum(int a, int b) {
	int sum = a + b;
	System.out.println("두 수의 합은 " + sum + "입니다.");
}
}
