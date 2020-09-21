package array;

public class Exam01 {

	public static void main(String[] args) {
//		2020-06-26 배열
//		array : 정수를 여러개 담을 수 있는 변수. 기본자료형은 아니다

		int[] score; // 배열의 선언
		score = new int[5]; // 배열에 5개의 정수를 담을 공간을 생성
		int[] score2 = new int[10]; // 기본 0으로 초기화 //배열을 셀 땐 0번째~n번쨰 요소로 센다.
		// ex) score[0] 스코어의 0번째 요소, score[3] 스코어의 3번째 요소

		System.out.println(score[0]);
		System.out.println(score2); // score2배열의 주소를 출력
		System.out.println(score2[0]); // score2배열의 0번째 요소를 출력함.
		System.out.println(score2[9]); // 0~9 총 10개

		score2[0] = 10; // score2배열의 0번째 요소에 10을 초기화
		score2[1] = 9; // score2배열의 1번째 요소에 9을 초기화
		score2[2] = 8; // score2배열의 2번째 요소에 8을 초기화

		System.out.println();

		System.out.println(score2[0]);
		System.out.println(score2[1]);
		System.out.println(score2[2]);

		// 배열의 초기화 방법
		int[] arr1 = new int[3]; // 0 0 0 실무에서 주로 사용
//		
		int[] arr2 = new int[] { 1, 2, 3 }; // 0~2번째 요소에 각각 1,2,3 초기화
//		int[] arr2;
//		arr2 = new int[] { 1, 2, 3 }; // 선언과 초기화 분리 가능

		int[] arr3 = {1,2,3}; // 0~2번째 요소에 각각 1,2,3 초기화
//		int[] arr3;
//		arr3 = {1,2,3}; // 선언과 초기화 분리 불가능
	}

}
