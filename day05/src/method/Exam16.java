package method;

import java.util.Scanner;

public class Exam16 {
public static void main(String[] args) {
	//12. 10번 문제를 풀었다면, 10번 문제에서 매개변수로 받는 이름, 나이, 주소를 scanner를 통한 입력으로 바꾸어 풀어보세요.
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
	System.out.println("이름은 " + a + "입니다.");
	System.out.println("나이는 " + b + "입니다.");
	System.out.println("주소는 " + c + "입니다.");
}

}
