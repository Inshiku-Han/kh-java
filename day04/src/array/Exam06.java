package array;

public class Exam06 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		int[] newArr = new int[5];

		// newArr = arr;

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]); // �� for�� ������ �� for�� ������ ���
		}

		
		System.out.println("\n");
		
		int[] arrr = { 5, 4, 3, 2, 1 };
		int[] newArrr = arrr; // newArrr�� arrr�� ��Ÿ����. ����newArrr�� ����
		
		newArrr[0] = 0; // newArrr�� ���� ���� = arrr�� ���� ����
		
		System.out.println(arrr[0]);
		System.out.println(newArrr[0]);
		System.out.println(arrr);
		System.out.println(newArrr); // �� ���� �ּҰ� ����

	}
}
