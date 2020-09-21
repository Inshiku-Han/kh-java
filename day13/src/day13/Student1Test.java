package day13;

import java.util.ArrayList;
import java.util.List;

public class Student1Test {
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();

		Student1 stu1 = new Student1();
		stu1.getPerson().setName("java"); // Student1에 있는 참조변수를 얻어 그 참조변수에 있는 메소드를 설정
		stu1.getPerson().setAge(20); // 나머지 이하 동일
		stu1.getSungjuk().setKorScore(80);
		stu1.getSungjuk().setEngScore(90);
		stu1.getSungjuk().setMathScore(100);
		list.add(stu1); // 값이 설정된 참조변수 stu1을 list에 저장

		Student1 stu2 = new Student1();

		stu2.getPerson().setPersonInfo("자바", 30);
		stu2.getSungjuk().getSungjukInfo(30, 20, 40);
		list.add(stu2);

		Student1 stu3 = new Student1();
		Person person = new Person();
		person.setPersonInfo("파이썬", 10); // person.메소드로 값을 설정
		stu3.setPerson(person); // stu3.메소드에 참조변수 대입
		Sungjuk sungjuk = new Sungjuk();
		sungjuk.getSungjukInfo(70, 70, 70);
		stu3.setSungjuk(sungjuk);
		list.add(stu3);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getPerson().toString());
			System.out.println(list.get(i).getPerson()); // toString메소드는 입력하지않아도 클래스자체를 출력시키면 내용물을 출력한다.
			System.out.println(list.get(i).getSungjuk());
			System.out.println("총점 = " + list.get(i).getSungjuk().getTotalScore());
			System.out.println("평균 = " + list.get(i).getSungjuk().getAvg() + "\n");
		}

		// 수학점수가 60점 이상인 학생들의 이름과 수학점수를 출력
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSungjuk().getMathScore() >= 60) {
				System.out.println("이름 = " + list.get(i).getPerson().getName() + " / " + "수학점수 = " + list.get(i).getSungjuk().getMathScore());
			}
		}
	}
}
