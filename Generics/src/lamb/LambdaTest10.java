package lamb;

public class LambdaTest10 {

	public static void main(String[] args) {
		Min min = (a, b) -> System.out.println("두 수 중 작은 값 = " + (a > b ? b : a));
		min.min(3, 5);
		
		Max max = (a, b) -> a > b ? a : b;
		System.out.println("두 수 중 큰 값 = " + max.max(3, 5));

		Square square = a -> a * a;
		System.out.println("정사각형의 넓이 = " + square.square(20));
		
		getArraySum arraySum = a -> {
			int sum = 0;
			for(int e : a) {
				sum += e;
			}
			return sum;
		};
		System.out.println("배열의 모든 요소의 합 = " + arraySum.sum(new int[] {10, 20, 30, 40}));
		
	}

}

interface Min{
	//매개변수로 받은 두 수 중 작은 값을 출력하는 기능
	void min(int a, int b);
}

interface Max{
	//매개변수로 받은 두 수 중 큰 값을 리턴하는 기능
	int max(int a, int b);
}

interface Square{
	//한변의 길이가 a인 정사각형의 넓이를 리턴하는 기능
	int square(int a);
}

interface getArraySum{
	//매개변수로 들어온 배열의 모든 요소의 합을 리턴
	int sum(int[] a);
}