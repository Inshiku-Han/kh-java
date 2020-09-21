package array;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
//		scanner로 정수 하나를 입력받아, 입력받은 정수만큼의 길이를 갖는 배열을 생성하고 
//		배열에 각 요소에 1 ~ 입력 받은 정수로 값을 저장한다. 
//		예를 들어 5를 입력했으면 길이가 5인 배열을 만들고 각 요소에 1,2,3,4,5가 들어가야 한다. 
//		그 후 배열에 들어간 수의 평균을 출력해보자. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = arr[i] + i;
		}
		for(int i = 0; i < arr.length ; i++) {
			sum = sum + arr[i];
		}
		double avg = (double)sum / input;
		System.out.println(avg);
		
		
		
		
		
		
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			sum = sum + arr[i];
//			if(arr[i] == input){
//				avg = sum / (double)input;
//			}
//		} // 나


	
//		for(int i = 0 ; i < arr.length ; i++) {
//			arr[i] = i + 1;
//			
//		}
//		for(int i = 0 ; i < arr.length ; i++) {
//			sum = sum + arr[i];
//		}
//			avg = sum / (double)arr.length; // 해설
//
//			System.out.println(avg);
			
			sc.close();
	}
}
