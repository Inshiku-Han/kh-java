package Student;

public class StudentTest {
public static void main(String[] args) {
	Student s = new Student(); // Student ��ü ����
	Student s1 = new Student("javava");
		
		
	s.setInfo("java");
	
	s.display();

	System.out.println();	
	
	s1.display();
	
	System.out.println();	// println()�޼ҵ� ���� ���������� ��½�ų �� �ִٴ� ������ �޼ҵ�����ε��̴�.
	
	s.setInfo("�ڹ�", 10, "C");		
	
	s.display();
	
}
}
