package calculator;

public class Calculator {
//	11. 계산기 클래스는 정수 두 개와 연산자를 멤버로 갖는다. 모든 멤버를 선언해보세요.
//	12. 계산기 클래스는 더하기, 뺴기, 나눗셈, 곱셈 기능을 가지고 있습니다.
//	각각의 메소드를 통해 연산의 결과를 리턴하는 메소드를 기능별로 하나씩 만드세요.
//	13. 계산기 클래스를 사용하는 클래스를 만들어 계산기 프로그램을 실행하여 보세요. 
//	main 메소드에서는 두 정수와 연산자를 scanner로 입력받습니다. 입력받은 연산자에 따라 더하기, 뺴기, 곱셈, 나눗셈 중 하나를 실행합니다. 
//	실행 후 결과를 출력해보세요. 실행 결과는 아래와 같아야 합니다.(굵은 기울임체는 입력받는 수입니다.)
//	-결과-
//	첫 번째 수 : 10
//	두 번째 수 : 20
//	연산자 : +
//	10 + 20 = 30
private	int num1;
private	int num2;
private	String op;
	
public	Calculator() { // 디폴트 생성자
	
}
public void setNum1(int num1) { // setter
	this.num1 = num1;
}
public void setNum2(int num2) { // setter
	this.num2 = num2;
}
public void setOp(String op) { // setter
	this.op = op;
}
public int getNum1() { // getter
	return num1;
}
public int getNum2() { // getter 
	return num2;
}
public String getOp() { // getter
	return op;
}
public int plus() { // 연산자 메서드
	return num1 + num2;
}
public int minus() { // 연산자 메서드
	return num1 - num2;
}
public int multi() { // 연산자 메서드
	return num1 * num2;
}
public double divide() { // 연산자 메서드  나눗셈은 실수로
	return num1 / (double)num2;
}

	}


