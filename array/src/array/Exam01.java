package array;

public class Exam01 {

	public static void main(String[] args) {
		//정수를 3개 저장할 수 있는 배열 선언
		int[] arr1 = new int[3];

		arr1[0] = 3;
	
		
//		int[][] arr2 = new int [3][4];
//		
//		for(int[] e : arr2) {
//			for(int f : e) {
//				System.out.print(f + "\t");
//			}
//			System.out.println();
//		}

		
//		int[][] arr3 = new int[2][4];
		
//		for(int[] e : arr3) {
//			
//			for(int f : e) {
//				System.out.print(f + "\t");
//			}
//			System.out.println("\n");
//		}
		
//		for(int j = 0; j < arr3.length;j++) {
//			for(int i = 0; i < arr3[j].length; i++) {
//				System.out.print(arr3[j][i] + "\t");
//			}
//			System.out.println("\n");
//		}
		
//		int[][][] arr4 = new int [3][3][3];
//		
//		for (int i = 0; i < arr4.length; i++) {
//			for (int j = 0; j < arr4[i].length; j++) {
//				System.out.println("\n");
//				for (int k = 0; k < arr4[i][j].length; k++) {
//					System.out.print("[" + i + "]" + "[" + j + "]" + "[" + k + "] = " + arr4[i][j][k] + "\t");
//				}
//			}
//		}
		
		int[][] arr6 = new int[3][];
		
		arr6[0] = new int [1];
		arr6[1] = new int [2];
		arr6[2] = new int [3];
		
		for(int[] e : arr6) {
			
			for(int f : e) {
				System.out.print(f + "\t");
			}
			System.out.println("\n");
		}
		
	}
}
