package array;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
//		scanner�� ���� �ϳ��� �Է¹޾�, �Է¹��� ������ŭ�� ���̸� ���� �迭�� �����ϰ� 
//		�迭�� �� ��ҿ� 1 ~ �Է� ���� ������ ���� �����Ѵ�. 
//		���� ��� 5�� �Է������� ���̰� 5�� �迭�� ����� �� ��ҿ� 1,2,3,4,5�� ���� �Ѵ�. 
//		�� �� �迭�� �� ���� ����� ����غ���. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
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
//		} // ��


	
//		for(int i = 0 ; i < arr.length ; i++) {
//			arr[i] = i + 1;
//			
//		}
//		for(int i = 0 ; i < arr.length ; i++) {
//			sum = sum + arr[i];
//		}
//			avg = sum / (double)arr.length; // �ؼ�
//
//			System.out.println(avg);
			
			sc.close();
	}
}
