package study;

public class While01 {

	public static void main(String[] args) {
		//while���� ������ �����ִ� ������ ������� �ʴ´�.
		int a = 0;
		while(a < 10) {
		a++;
			System.out.print(a + " ");
		}
		System.out.println();
		
		int b = 0;
		while(b < 10) {
		++b;
			System.out.print(b + " ");
		}
		System.out.println();
		
		int c = 0;
		while(c < 10) {
			System.out.print(c++ + " "); // ����
		}
		System.out.println();
		
		int d = 0;
		while(d < 10) {
			System.out.print(++d + " "); // ����
			}
		}

}
