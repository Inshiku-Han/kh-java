package if_switch;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 정수 하나를 입력받아 입력받은 정수가 
		// 짝수면 '짝수입니다' 를 출력하고,
		// 홀수면 '홀수입니다' 를 출력하세요. %2짝수 %3홀수
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		System.out.println();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else if(num % 3 == 1) {
			System.out.println("홀수입니다.");
		}
		sc.close();
	}

}
