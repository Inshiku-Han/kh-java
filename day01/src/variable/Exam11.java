package variable;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		//학생의 개인정보를 입력하고, 입력된 정보를 출력하는 프로그램
		//을 만들어 보자.
		//학생의 개인정보는 이름, 나이, 국,영,수 점수, 총점, 평균을
		//가진다.
		//모든 정보를 입력받아, 입력받은 정보를 다시 출력하는 프로그램
		//을 완성하세요.
		//단, 이름은 마지막에 입력받는다.
		Scanner sc = new Scanner(System.in);
		String name;
		int age = 0;
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		System.out.print("국어점수를 입력해주세요 : ");
		korScore = sc.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		engScore = sc.nextInt();
		System.out.print("수학점수를 입력해주세요 : ");
		mathScore = sc.nextInt();
		sc.nextLine();
		System.out.print("이름을 입력해주세요 : ");
		name = sc.nextLine();	//위에 sc.nextLine();을 지우고 name = sc.next();도 가능
		
		System.out.println();
		System.out.println("결과");
		
		totalScore = korScore + engScore + mathScore;
		avg = totalScore / 3.0;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("국어점수 : " + korScore);
		System.out.println("영어점수 : " + engScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + String.format("%.2f" , avg));
		System.out.println("평균 : " + String.format("%.3f" , avg));
		System.out.println("평균 : " + Math.round(avg*100)/100.0);
		System.out.println("평균 : " + Math.round(avg*1000)/1000.0);
//		Math.round(double * 10n) / 10n.0함수는 소수점아래가 0일경우 절삭하지만 
//		String.format("%.nf" , double)은 절삭하지 않고 그대로 리턴합니다
		sc.close();
		
	}

}
