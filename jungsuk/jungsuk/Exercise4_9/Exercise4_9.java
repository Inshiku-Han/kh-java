package Exercise4_9;

public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum=" + sum);
		System.out.println((int) '5' + (int) '4' + (int) '3' + (int) '2' + (int) '1');
		System.out.println((int) '0');
		System.out.println((int) '1');
		System.out.println((int) '2');
		System.out.println((int) '3');
		System.out.println((int) '4');
		System.out.println((int) '5');
		System.out.println((int) '5' - (int) '0' + (int) '4' - (int) '0' + (int) '3' - (int) '0' + (int) '2' - (int) '0'
				+ (int) '1' - (int) '0');
	}

}
