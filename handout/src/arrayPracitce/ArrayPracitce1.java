package arrayPracitce;

import java.util.Scanner;

public class ArrayPracitce1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б : ");
		int[] num = new int[sc.nextInt()];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum = num[i]+sum;
		}
		System.out.println(sum/(double)num.length);
		
		sc.close();
	}
	
}
