package for_while;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	
		int num = 0;
		
		System.out.print("입력 : ");
		num = sc.nextInt();
		
		if(num % 5 != 0) {
			System.out.println("5의 배수를 입력하세요");
		}
		sc.close();
	}

}
