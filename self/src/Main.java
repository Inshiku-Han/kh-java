import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		int[][] a = new int[3][4];
//		int t = 0;
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				t++;
//				a[i][j] = t;
//				System.out.print(a[i][j] + "\t");
//			}
//			System.out.println("\n");
//		}
//		

//		int i = 0, j = 0, sw = 0;
//		while (i < 100) {
//			i = i + 1;
//			if (sw == 0) {
//				j = j + i;
//				sw = 1;
//			} else {
//				j = j - i;
//				sw = 0;
//			}
//			System.out.println("i�� �� = " + i + " __ " +"j�� �� = "+ j);
//		}
//		System.out.println("�հ� = " + j);

		// ���μ�����
//		int n, c, k, y;
//		int s[] = new int[10];
//		while (true) {
//			n = sc.nextInt();
//			if (n < 2) {
//				break;
//			}
//			c = -1;
//			do {
//				k = 2;
//				while (n % k != 0) {
//					k++;
//				}
//				c++;
//				s[c] = k;
//				n /= k;
//			} while (n != 1);
//			if (c == 0) {
//				System.out.println("�Ҽ�");
//			} else {
//				for (y = 0; y <= c -1; y++) {
//					System.out.printf("%dX", s[y]);
//					System.out.printf("%d", s[c]);
//				}
//			}
//		}

		//���� ���� �����~
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}
}
