package person;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setInfo("�ڹ�", 20, 90);
		s1.getInfo();

		Person p2 = new Student(); //������,�������̵����� Person���+Student���. Student�� int���� �𸥴�.
		p2.setInfo("c++", 80);
		p2.getInfo();
		
		Student p3 = (Student) p2; // p2�� ����ȯ. Student�� �޼ҵ� ��� ����
		p3.setInfo("���̽�", 10, 95);
		p3.getInfo();
	}

}
