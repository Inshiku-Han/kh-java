package for_while;

public class Exam01 {

	public static void main(String[] args) {
		//2020-06-25 반복문
		int num = 0;
		while (num < 5) { // while(false) 될 때 까지 반복실행
			System.out.println("*");
			num++;
		}

		System.out.println();
		
		//1~5까지 출력, 1 2 3 4 5
		int num2 = 0;

		while ( num2 < 5) {
			System.out.println(++num2);
			
		}
	}
}
