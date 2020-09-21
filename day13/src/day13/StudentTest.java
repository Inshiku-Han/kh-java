package day13;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>(); // 객체의 컬렉션 프레임워크

		Student st1 = new Student();

		list.add(st1); // null 0 null

		Student st2 = new Student();
		st2.setName("자바");
		st2.setAge(20);
		st2.setGrade("A");
		list.add(st2);

		Student st3 = new Student();
		st3.setStudentInfo("C++", 30, "B");
		list.add(st3);

//		 마지막에 들어간 학생의 정보를 출력
		for (int i = 0; i < list.size(); i++) {
			list.get(i).displayStudentInfo(); //클래스.메소드
			System.out.println();
		}
		System.out.println();
		
		for(Student e: list) { // 강화for문 클래스 출력할때는 참조변수로 출력   Student e = list 의 형태
			e.displayStudentInfo(); // 클래스e.메소드
			System.out.println();
		}
		
		System.out.println();
		
		//list에 들어간 모든 학생의 이름만 출력
		for(Student e : list) {
			System.out.print(e.getName() + " ");
		}
		
		System.out.println("\n");
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i).getName() + " ");
		}
		System.out.println("\n");
		
		//list에 들어간 모든 학생의 나이 합을 출력
		int sum = 0;
		for(Student e : list) {
			sum += e.getAge();
			
		}
		System.out.println(sum);
		System.out.println();
		
		int sum1 = 0;
		for(int i = 0 ; i < list.size(); i++) {
			sum1 += list.get(i).getAge();
		}
		System.out.println(sum1);
	}
}
