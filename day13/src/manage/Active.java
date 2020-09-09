package manage;

import java.util.Scanner;

public class Active {
	// 학생관리 프로그램을 만들어 보자.
	// 학생관리 프로그램은 학생등록, 학생정보변경, 학생삭제, 학생정보출력의 기능이 있다.
	// 해당 프로그램을 완성하기 위해 학생클래스와 학생관리 기능을 제공하는 클래스가 존재한다.
	// 학생 클래스는 이름, 나이, 학점(A,B,C...), 연락처 정보를 가지고 있다.
	// 학생관리 클래스는 학생등록, 학생정보변경(연락처), 학생삭제, 학생정보출력의 기능이 있다.
	// 아래는 프로그램의 실행 예시이다. 아래와 같이 프로그램이 실행될 수 있게 만들어보세요.
	// 예시)
	// 학생관리 프로그램을 실행합니다.
	// 1)학생등록 2)학생정보변경(연락처) 3)학생삭제 4)학생정보출력 5)모든 학생정보출력 6)프로그램 종료
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManage sm = new StudentManage();
		System.out.println("학생관리 프로그램을 실행합니다.");
		while (true) {
			System.out.print("1)학생등록 2)학생정보변경(연락처) 3)학생삭제 4)학생정보출력 5)모든 학생정보출력 6)프로그램 종료");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				sm.regStudent();
				break;
			case 2:
				sm.changeTellNumber();
				break;
			case 3:
				sm.StudentDelete();
				break;
			case 4:
				sm.displayInfo();
				break;
			case 5:
				sm.AllDisplayInfo();
				break;
			case 6:
				sc.close();
				sm.exitProgram();
				
			}
			
		}
	}
}
