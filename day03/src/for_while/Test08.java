package for_while;

import java.util.Scanner;

public class Test08 {
public static void main(String[] args) {
	//�� ���� �Է¹޾� �� �� ������ ��� ���ڵ��� �� ���
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int min = 0;
	int max = 0;
	int sum = 0; // �� �� ������ ���� �����ϱ� ���� ����
	
	//�Է� ���� ������ ū���� ���� ���� �������� ����
	if(num1 > num2) {
		max = num1;
		min = num2;
	}
	else {
		max = num2;
		min = num1;
	}
	
	//�� �� ������ ���� ���ϴ� ����
	for(int i = min ; i <= max ; i++) {
		sum = sum + i;
	}
	System.out.println(sum);
	
	sc.close();
	
}
}
