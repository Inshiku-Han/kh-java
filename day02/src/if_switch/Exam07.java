package if_switch;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		//정수 하나를 입력받아서,
		//입력받은 정수가 5의 배수이면서 3의 배수이면서 2의 배수이면
		//*를 출력하세요
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		
//		if(num % 5 == 0) {
//			if(num % 3 == 0) {
//				if(num % 2 == 0) {
//					System.out.println("*"); // 나
//				}
//			}
//			
//		}
		if(num % 5 == 0 && num % 3 == 0 && num % 2 == 0) {
			System.out.println("*"); // 해설
		}
		//5의 배수 이면서 3의 배수이거나,
		//5의 배수이면서 2의 배수이면 *를 출력하세요
		if((num % 5 == 0 && num % 3 == 0) || (num % 5 == 0 && num % 2 == 0)) {
			System.out.println("*"); // 나
		}
		if(num % 5 == 0 && num % 3 == 0 || num % 5 == 0 && num % 2 == 0) {
			System.out.println("*"); // 해설, &&(and)를 계산 하고 ||(or)을 계산한다
		}
		if(num % 5 == 0 && (num % 3 == 0 || num % 2 == 0)) {
			System.out.println("*"); // 해설2
		}
		sc.close();
	}

}
