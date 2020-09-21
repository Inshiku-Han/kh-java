package if_switch;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 0~100사이의 정수 하나를 입력받아,
		// 그 수가 90~100점 사이면 A를 출력
		// 그 수가 80~90점 사이면 B를 출력
		// 그 수가 70~80점 사이면 C를 출력
		// 그 수가 70점 미만이면 D를 출력
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = "";
		
		System.out.print("점수를 입력해 주세요 : ");
		num = sc.nextInt();
		
//		if(num >=90) {
//			System.out.println("A");
//		}else if(num >=80 && num < 90) {
//			System.out.println("B");
//		}	
//			else if(num >=70 && num < 80) {
//				System.out.println("C");
//		}else {
//			System.out.println("D");
//		} // 나
		
		if(num >= 90) {
			str = "A";
		}else if(num >= 80) {
			str = "B";
		}else if(num >= 70) {
			str = "C";
		}else {
			str = "D";
		}
		System.out.println(str); // 해설
		sc.close();
	}

}
