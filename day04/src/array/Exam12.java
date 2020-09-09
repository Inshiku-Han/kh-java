package array;

public class Exam12 {

	public static void main(String[] args) {
		// 정수 10개를 담을 수 있는 배열을 생성하고, Math.random() 함수를 사용하여 1 ~ 100의 정수를 배열 각 요소에 저장하자
		// 배열에 저장된 모든 정수 및 최소값, 최대값을 출력해보라
		int[] rand = new int[10];
		int min = 100;
		int max = 0;

		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 100 + 1);
			if (max < rand[i]) {
				max = rand[i];
			}
			if (min > rand[i]) {
				min = rand[i];
			}
			System.out.print(rand[i] + " ");
		}
		System.out.println();
		System.out.println("최대값 = " + max + " " + "최소값 = " + min);
		System.out.println();

		// for-each문의 경우
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 100 + 1);
		}
		for (int e : rand) { //배열에 값이 생성된 후 for-each를 사용
			System.out.print(e + " ");
			if (e > max) {
				max = e;
			}
			if (e < min) {
				min = e;
			}
		}
		System.out.println();
		System.out.println("최대값 = " + max + " " + "최소값 = " + min);

	}
}
