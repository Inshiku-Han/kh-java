package method;

public class Exam31 {

	public static void main(String[] args) {
		// 9. �� ������ �Ű������� �޾�, 1���� �Ű������� ���� ������ �� Ȧ���� ���� �����ϴ� �޼ҵ带 �����ϰ� ����غ�����.

		System.out.println(odd(6));
	}

	public static int odd(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
