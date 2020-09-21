package for_while;

public class Test11 {

	public static void main(String[] args) {
//		while문을 사용하여 0 ~ 10까지의 합을 구하여라
		
		int sum = 0;
		int i = 0;
		
		while(i < 11) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
