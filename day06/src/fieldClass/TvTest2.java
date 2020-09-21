package fieldClass;

public class TvTest2 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		System.out.println(arr1[0]);

//		String[] arr = new String[3]; // 기본자료형 외의 자료형은 null로 초기화된다. String은 자바 기본 클래스
		Tv[] arr2 = new Tv[3]; // Tv 클래스의 배열선언. 클래스의 배열선언은 null로 초기화된다.
		arr2[0] = new Tv(); // 배열에 공간생성
		arr2[1] = new Tv();
		arr2[2] = new Tv();

		System.out.println(arr2[0].channel);

	}
}
