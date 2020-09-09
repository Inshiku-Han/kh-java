package for_while;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
//		do while문
		
//		int num = 1;
//		
//		while(num < 11) {
//			System.out.println(num);
//			num = num + 1;
//		}
//		
//		System.out.println();
//		
//		for(int i = 1; i < 11 ; i++) {
//			System.out.println(i);
//		}
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
//		while(true) {
//			System.out.print("점수 입력 : ");
//			num = sc.nextInt();
//			if(num >= 0 && num <= 100) {
//				break;
//			}
//		}
		
		do  {         // do 내용을 실행, while이 true이면 다시 do 실행 , 조건 검사를 나중에 확인해서 false여도 한번은 실행
			System.out.print("점수 입력 : "); // do while은 잘 안씀
			num = sc.nextInt();
		}while(num < 0 || num > 100);    // 0~100을 벗어날 때
		
		
		sc.close();
		
	}

}
