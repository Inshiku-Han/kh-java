package if_switch;

public class Exam01 {

	public static void main(String[] args) {
//		증감연산자
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
		++a;  // 단독으로 쓰이면
		b++;  // 둘다 동일
		System.out.println(a + " " + b);
		
		b = ++a; // 증감 후 연산
		//a++; b = a;
		System.out.println(a + " " + b);
		
		b = a++; // 연산 후 증감
		//b = a; a++;
		System.out.println(a + " " + b);
		
		a = b++; // 연산 후 증감
		System.out.println(a + " " + b);
		
		boolean flag = true;
		System.out.println(flag + " " + !flag);
	}

}
	