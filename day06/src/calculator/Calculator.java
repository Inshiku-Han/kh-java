package calculator;

public class Calculator {
//	11. ���� Ŭ������ ���� �� ���� �����ڸ� ����� ���´�. ��� ����� �����غ�����.
//	12. ���� Ŭ������ ���ϱ�, ����, ������, ���� ����� ������ �ֽ��ϴ�.
//	������ �޼ҵ带 ���� ������ ����� �����ϴ� �޼ҵ带 ��ɺ��� �ϳ��� ���弼��.
//	13. ���� Ŭ������ ����ϴ� Ŭ������ ����� ���� ���α׷��� �����Ͽ� ������. 
//	main �޼ҵ忡���� �� ������ �����ڸ� scanner�� �Է¹޽��ϴ�. �Է¹��� �����ڿ� ���� ���ϱ�, ����, ����, ������ �� �ϳ��� �����մϴ�. 
//	���� �� ����� ����غ�����. ���� ����� �Ʒ��� ���ƾ� �մϴ�.(���� �����ü�� �Է¹޴� ���Դϴ�.)
//	-���-
//	ù ��° �� : 10
//	�� ��° �� : 20
//	������ : +
//	10 + 20 = 30
private	int num1;
private	int num2;
private	String op;
	
public	Calculator() { // ����Ʈ ������
	
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
public int plus() { // ������ �޼���
	return num1 + num2;
}
public int minus() { // ������ �޼���
	return num1 - num2;
}
public int multi() { // ������ �޼���
	return num1 * num2;
}
public double divide() { // ������ �޼���  �������� �Ǽ���
	return num1 / (double)num2;
}

	}


