package array;

public class Exam07 {

	public static void main(String[] args) {
		//�迭�� �ѹ������ ũ�� ������ �Ұ��ϴ�
//		1,2,3�� �ʱⰪ���� ���� �迭 arr1�� 4,5,6�� �ʱⰪ���� ���� arr2�� �����. 
//		�� �� ���ο� �迭 newArr�� ����� arr1�� arr2�� ��� ���� �����غ���. ���� �� newArr�� 
//		1,2,3,4,5,6�� ������ �Ѵ�.
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		int[] newArr = new int[arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		for(int i = 0 ; i < arr2.length ; i++) {
			newArr[i+arr1.length] = arr2[i];
		}
		
		for(int i = 0; i < newArr.length ; i++) {
			System.out.println(newArr[i]);
		}
	}

}
