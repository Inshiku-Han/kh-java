package array;

public class Exam02 {

	public static void main(String[] args) {
//		int[][] arr = new int[4][];
//		
//		arr[0] = new int [3];
//		arr[1] = new int [2];
//		arr[2] = new int [3];
//		arr[3] = new int [2];
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = 10 * (i + 1) + j;
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println("\n");
//		}

		int[][] fourByFour = new int[4][4];
		int cnt = 0;

		while (true) {
			int addrRan1 = (int) (Math.random() * 4);
			int addrRan2 = (int) (Math.random() * 4);
			int inputRan = (int) (Math.random() * 10 + 1);

			if (fourByFour[addrRan1][addrRan2] == 0) {
				fourByFour[addrRan1][addrRan2] = inputRan;
				cnt++;

				if (cnt == 8) {
					break;
				}
			}

		}
		
		for (int[] e : fourByFour) {
			for (int f : e) {
				System.out.print(f + "\t");
			}
			System.out.println("\n");
		}

	}

}
