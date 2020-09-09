package person;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setInfo("자바", 20, 90);
		s1.getInfo();

		Person p2 = new Student(); //다형성,오버라이딩으로 Person출력+Student출력. Student의 int값은 모른다.
		p2.setInfo("c++", 80);
		p2.getInfo();
		
		Student p3 = (Student) p2; // p2를 형변환. Student의 메소드 사용 가능
		p3.setInfo("파이썬", 10, 95);
		p3.getInfo();
	}

}
