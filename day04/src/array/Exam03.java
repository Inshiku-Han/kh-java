package array;

public class Exam03 {

	public static void main(String[] args) {
		int[] arr1 = new int[100];
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);

		for (int i = 0; i < arr1.length; i++) { // �迭 ���̸�ŭ �ݺ�. ����ȭ
			System.out.println(arr1[i]); // 0�� 100��
		} // �迭�� for�� ���� ����

		System.out.println();

		for (int j = 0; j < arr1.length; j++) {
			arr1[j] = 10;
			System.out.println(arr1[j]); // 10�� 100��
		}

		System.out.println();
		System.out.println(arr1.length); // �迭�� ����

	}

}
