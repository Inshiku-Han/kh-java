package if_switch;

public class Exam03 {

	public static void main(String[] args) {
		int a = 10;
		
		if(a > 5) {
			System.out.println("a�� 5���� Ů�ϴ�.");
		}else {    // false�� ��� else�� ���
			System.out.println("a�� 5���� ũ�� �ʽ��ϴ�.");
			}
		
		int b = 5;
		
		if(b > 5) {
			System.out.println("b�� 5���� Ů�ϴ�.");
		}else  if(b < 5){
			System.out.println("b�� 5���� �۽��ϴ�.");
		}else {
			System.out.println("b�� 5�Դϴ�");
		} // if��, if (else)��, if else if (else) ��
		
		
	}

}
