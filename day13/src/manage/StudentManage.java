package manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {
	Scanner sc = new Scanner(System.in);
	private List<Student0> studentList;

	public StudentManage() {
		studentList = new ArrayList<>();

	}

	public void regStudent() {
		System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요");
		System.out.println("이름 = ");
		String name = sc.nextLine();
		System.out.println("나이 = ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("연락처 = ");
		String adress = sc.nextLine();
		System.out.println("학점 = ");
		String grade = sc.nextLine();
		Student0 student = new Student0(name, age, grade, adress);

		studentList.add(student);

	}

	public void changeTellNumber() {

		System.out.println("학생의 연락처를 변경합니다.");
		while (true) {
			System.out.println("변경 학생 : ");
			String change = sc.nextLine();

			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getName().equals(change)) {
					System.out.println("연락처 = ");
					studentList.get(i).setAdress(sc.nextLine());
					System.out.println("변경완료되었습니다.");
					return; // 메소드 실행 종료
				}

			}
			System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
		}
	}

	public void StudentDelete() {
		System.out.println("학생 정보를 제거합니다.");
		while (true) {
			System.out.println("제거할 학생 : ");
			String name = sc.nextLine();
			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getName().equals(name)) {
					System.out.println("변경 학생 : ");
					studentList.remove(i);
					System.out.println("학생의 정보를 제거하였습니다.");
					return; // 메소드 실행 종료
				}

			}
			System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
		}
	}

	public void displayInfo() {
		while (true) {
			System.out.println("정보를 열람할 학생 : ");
			String name = sc.nextLine();
			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getName().equals(name)) {
					System.out.println("요청하신 학생의 정보입니다.");
					System.out.println("이름 : " + studentList.get(i).getName() + ", " + "나이 : "
							+ studentList.get(i).getAge() + ", " + "연락처 : " + studentList.get(i).getAdress() + ", "
							+ "학점 : " + studentList.get(i).getGrade());
					return; // 메소드 실행 종료
				}

			}
			System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
		}
	}

	public void AllDisplayInfo() {
		System.out.println("모든 학생의 정보입니다. 총 학생 수는 " + studentList.size() + "명입니다.");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("이름 : " + studentList.get(i).getName() + ", " + "나이 : " + studentList.get(i).getAge()
					+ ", " + "학점 : " + studentList.get(i).getGrade());
		}
	}

	public void exitProgram() {
		System.exit(0);
	}
}
