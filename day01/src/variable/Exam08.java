package variable;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
//		스캐너 생성
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
//		스캐너로 정수값 입력받기
		a = sc.nextInt();
		System.out.println("a = " + a);
		
//		스캐너로 문자열 입력받기
		String str;
		sc.nextLine();
		str = sc.nextLine();
		System.out.println("str = " + str);
		sc.close();
	}

} 
