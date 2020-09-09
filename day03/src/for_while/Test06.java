package for_while;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		369 게임을 만들자. 1~99까지의 정수를 입력받고 정수에 3.6.9중 하나가 있는 경우에는 
//		박수짝을 출력, 두 개 있는 경우는 박수짝짝을 출력
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("숫자를 입력해주세요 : ");
		a = sc.nextInt();
		
		if(a >= 1 && a <= 99) {
			b = a %10;
		}

		sc.close();
	}
}