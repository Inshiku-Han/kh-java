package variable;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
//		국어, 수학, 영어 점수를 입력받아서
//		세 과목의 점수와, 세 과목의 총점, 평균까지
//		출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
//		처음에 int에 0, double에 0.0넣어서 초기화
		int korScore = 0;
		int mathScore = 0;
		int engScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		System.out.print("국어 점수 : ");
		korScore = sc.nextInt();
		System.out.print("수학 점수 : ");
		mathScore = sc.nextInt();
		System.out.print("영어 점수 : ");
		engScore = sc.nextInt();
		
//		변수도 자동완성 가능
		System.out.println("국어 점수 = " + korScore);
		System.out.println("수학 점수 = " + mathScore);
		System.out.println("영어 점수 = " + engScore);
		
		totalScore = korScore + mathScore + engScore;//totalScore는 정수
		avg = totalScore / 3.0;//실수값을 얻으려면 totalScore/실수값; 으로 해야함
		System.out.println("총점 = " + totalScore);
		System.out.println("평균 = " + avg);
		sc.close();
	}

}
