package array;

public class Exam10 {

	public static void main(String[] args) {
		//최소값 찾기
		int min = 100;  // 큰 값을 준 후 작은 값을 찾는다.
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

}
