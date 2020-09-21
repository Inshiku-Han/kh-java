package method;

public class Exam38 {
public static void main(String[] args) {
	//6. 정수형 배열을 매개변수로 받아 배열의 모든 요소 중 최대값을 리턴하는 메소드를 만들고 호출해보세요.
	int[] a = {1,3,2,4,5};
	System.out.println(max(a));
}

public static int max(int[] a) {
	int sum = 0;
	for(int i = 0; i < a.length; i++) {
		if(sum < a[i]) {
			sum = a[i];
		}
		
	}
	return sum;
}
}
