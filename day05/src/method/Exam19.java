package method;

public class Exam19 {
	public static void main(String[] args) {
		// 16. �� ������ �Ű������� �޾�, 0���� �Է¹��� ���ڱ��� ����ϴ� �޼ҵ带 �����ϰ� ȣ���غ�����.

		int[] a = new int[5]; // �����Է�
		arr(a);

	}

	public static void arr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.println(a[i]);
		}
	}
}
