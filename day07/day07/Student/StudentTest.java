package Student;

public class StudentTest {
public static void main(String[] args) {
	Student s = new Student(); // Student 객체 생성
	Student s1 = new Student("javava");
		
		
	s.setInfo("java");
	
	s.display();

	System.out.println();	
	
	s1.display();
	
	System.out.println();	// println()메소드 또한 여러가지를 출력시킬 수 있다는 점에서 메소드오버로딩이다.
	
	s.setInfo("자바", 10, "C");		
	
	s.display();
	
}
}
