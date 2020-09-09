package method;

public class Exam37 {
public static void main(String[] args) {
	//5. 정수형 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.
	int[] a = new int [10]; // 입력란
	arr(a);
}

public static void arr(int[] a) {
	for(int i = 0; i < a.length ; i++) {
		System.out.print(a[i] + "\t");
	}
}
}
