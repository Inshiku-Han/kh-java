package method;

public class Exam20 {
public static void main(String[] args) {
	//17. 두 정수를 매개변수로 받아, 두 정수 사이의 모든 숫자를 출력하는 메소드를 선언하고 호출해보세요.
	arr(120, 150);
}

public static void arr(int a, int b) {
	int[] c = new int[b-a];
	for(int i = 0; i < c.length-1; i++) {
		
			c[i] = a+(i+1);
			System.out.println(c[i]);
		
	}
}
}
