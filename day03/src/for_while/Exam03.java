package for_while;

public class Exam03 {

	public static void main(String[] args) {
		int num = 0; //0

		while (num < 5) { //1
			System.out.println("*"); //2
			num++; //3
		}
		for (int num1 = 0; /*0*/  num1 < 5; /*1*/ num1++ /*3*/) {
			// �ȿ��� ��������, ���� ����, ���� ����
			// for�ȿ��� ����� ������ for�ۿ��� ���Ұ�
			System.out.println("*"); /*2*/
		}
		
		System.out.println();
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}
	}

}
