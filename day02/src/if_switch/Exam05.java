package if_switch;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		//정수 하나를 입력받아 입력받은 수가 10보다 크면
		//*을 출력하고, 10보다 작으면 !를 출력하고, 10과 같으면 @를 출력
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.print("입력 : ");
		a = sc.nextInt();
		
		if(a > 10) {
			System.out.println("*");
		}else if(a < 10){
			System.out.println("!");
		}else {
			System.out.println("@");
		}
		sc.close();
	}
}
