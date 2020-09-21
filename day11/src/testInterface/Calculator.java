package testInterface;

public class Calculator implements Calc{

	@Override
	public int sum(int a, int b) {
		
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return  a - b;
	}

	@Override
	public int multi(int a, int b) {
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		return a / (double)b;
	}
	
}
