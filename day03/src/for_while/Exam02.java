package for_while;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 1;
		
		System.out.print("¸î ´Ü? : ");
		i = sc.nextInt();
		
		
		while(j < 10) {
			System.out.println(i + " * " + j + " = " + (i*j));
			++j;
		}
		sc.close();
	}

}
