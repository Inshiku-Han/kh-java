package method;

public class Exam21 {
	public static void main(String[] args) {
		// 18. �� ������ �Ű������� �޾�, �� ���� ������ 5�� ����� ������ ����ϴ� �޼ҵ带 �����ϰ� ȣ���غ�����.
		
		multi(1, 19);
	}

	public static void multi(int a, int b) {
		int sum = 0;
		for(int i = a; i < b; i++) {
			if(i % 5 == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
