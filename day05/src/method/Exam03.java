package method;

public class Exam03 {

	public static void main(String[] args) {
		// 1.'�ȳ��ϼ���.' ��� ���ڿ��� ����ϴ� ����� ���� �޼ҵ带 �����ϰ� ȣ��
		 hello();

		// 2.'�ݰ����ϴ�'��� ���ڿ��� ����ϴ� ����� ���� �޼ҵ��
		// '�������'��� ���ڿ��� ����ϴ� �޼ҵ带 ���� �����ϰ�,
		// ���� ��� '�ݰ����ϴ� �������'��� ���ڿ��� ��µǰ� ȣ��
		meet();
		 	welcome();

		// 3.���� �ϳ��� �Ű������� �޾�, �� ���� ����ϴ� �޼ҵ� ���� ȣ��
		number(20);
		
		//4.���ڿ� �Ű����� �޼ҵ� ���� ȣ��
		character("�ǰ�");
		 
		 //�ٸ� �޼ҵ忡 �ٸ� �޼ҵ� �־ ��� ���� ex)b�޼ҵ�ȿ� a�޼ҵ� ȣ�� �� b�޼ҵ带 ���θ޼ҵ忡�� ȣ�Ⱑ��
	}

	public static void hello() {
		System.out.println("�ȳ��ϼ���.");
	}

	public static void meet() {
		System.out.print("�ݰ����ϴ�");
		System.out.print(" ");
		welcome();
	}

	public static void welcome() {
		System.out.println("�������");
	}

	public static void number(int num) {
		System.out.println(num);
	}
	public static void character(String abc) {
		System.out.println(abc);
	}
}
