package method;

public class Exam39 {
	public static void main(String[] args) {
		// 7. ���ڿ� �迭�� �Ű������� �޾� �迭�� ����� ��� ���ڿ��� �����Ͽ� �����ϴ� �޼ҵ带 ����� ȣ���غ�����.
		String[] a = { "��", "��", "��", "��", "��" };
		System.out.print(name(a));

	}

	public static String name(String[] a) {
		String b = ""; //null���� �����
		for (int i = 0; i < a.length; i++) {
			b = b + a[i];

		}
		return b;
	}
}
