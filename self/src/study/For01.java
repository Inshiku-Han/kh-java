package study;

public class For01 {

	public static void main(String[] args) {
		//for�� �ȿ��� ���ǵ� ������ for���� ������ �޸𸮿��� �������.
		for(int a = 0; a < 10; a++) { // ����
			System.out.print(a + " ");
			}
		System.out.println();
		for(int b = 0; b < 10; ++b) {// ����
			System.out.print(b + " ");
			}
		System.out.println();
		for(int c = 0; c < 10; ) {
			System.out.print(c++ + " ");
			}
		System.out.println();
		for(int d = 0; d < 10; ) {
			System.out.print(++d + " ");
			}
		
		}
	}
