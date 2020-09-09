package for_while;

import java.util.Scanner;

public class Test08 {
public static void main(String[] args) {
	//두 수를 입력받아 두 수 사이의 모든 숫자들의 합 출력
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int min = 0;
	int max = 0;
	int sum = 0; // 두 수 사이의 합을 저장하기 위한 변수
	
	//입력 받은 수에서 큰수와 작은 수를 결정짓는 로직
	if(num1 > num2) {
		max = num1;
		min = num2;
	}
	else {
		max = num2;
		min = num1;
	}
	
	//두 수 사이의 합을 구하는 로직
	for(int i = min ; i <= max ; i++) {
		sum = sum + i;
	}
	System.out.println(sum);
	
	sc.close();
	
}
}
