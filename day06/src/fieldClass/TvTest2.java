package fieldClass;

public class TvTest2 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		System.out.println(arr1[0]);

//		String[] arr = new String[3]; // �⺻�ڷ��� ���� �ڷ����� null�� �ʱ�ȭ�ȴ�. String�� �ڹ� �⺻ Ŭ����
		Tv[] arr2 = new Tv[3]; // Tv Ŭ������ �迭����. Ŭ������ �迭������ null�� �ʱ�ȭ�ȴ�.
		arr2[0] = new Tv(); // �迭�� ��������
		arr2[1] = new Tv();
		arr2[2] = new Tv();

		System.out.println(arr2[0].channel);

	}
}
