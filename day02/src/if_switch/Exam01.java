package if_switch;

public class Exam01 {

	public static void main(String[] args) {
//		����������
		int num = 10;
		num += 1; // num = num + 1;
		num -= 1; // num = num - 1;
		num *= 1; // num = num * 1;
		num /= 1; // num = num / 1;
		System.out.println(num);
		
		int num2 = 10;
		num2++; // num = num + 1;
		++num2; // num = num + 1;
		System.out.println(++num2);
		System.out.println(num2++);
		
		
		int a = 0;
		int b = 0;
		++a;  // �ܵ����� ���̸�
		b++;  // �Ѵ� ����
		System.out.println(a + " " + b);
		
		b = ++a; // ���� �� ����
		//a++; b = a;
		System.out.println(a + " " + b);
		
		b = a++; // ���� �� ����
		//b = a; a++;
		System.out.println(a + " " + b);
		
		a = b++; // ���� �� ����
		System.out.println(a + " " + b);
		
		boolean flag = true;
		System.out.println(flag + " " + !flag);
	}

}
	