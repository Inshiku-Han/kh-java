package if_switch;

public class Exam04 {
	public static void main(String[] args) {
		int num = 5;
		//num�� 5���� ũ�� 20���� ������ *�� ���
		//���� ������ �������� ������ !�� ���
		if(num > 5) {
			if (num < 20) {
				System.out.println("*");
			}
		}else {
			System.out.println("!");
		}
		if(num > 5 && num < 20) {
			System.out.println("*");
		}else {
			System.out.println("!");
		}
	}
}
