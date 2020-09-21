package Person;

public class PersonTest {
public static void main(String[] args) {
	Person p = new Person();
	Person s = new Person("한인식", 26); // 처음부터 값을 넣어줄 때
	
	
	p.display();
	System.out.println();
	s.display();
}
}
