package array;

public class Exam10 {

	public static void main(String[] args) {
		//�ּҰ� ã��
		int min = 100;  // ū ���� �� �� ���� ���� ã�´�.
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

}
