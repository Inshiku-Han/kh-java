package method;

public class Exam40 {

	public static void main(String[] args) {
		// 8. ������ �迭 �� ���� �Ű������� �޾� �� �迭�� ��� ��Ҹ� ���� ���ο� �迭�� �����ϴ� �޼ҵ带 ����� ȣ���غ�����.
		int[] a = { 1, 3, 5 };
		int[] b = { 2, 4, 6 };
		int[] c = list(a, b);
		for (int e : c) { //c�迭�� e �迭 ������ �־� ���ʴ�� ���
			System.out.print(e);

		}
	}

	public static int[] list(int[] a, int[] b) {
		int[] x = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			x[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			x[i + a.length] = b[i];

		}
		return x;
	}
}
