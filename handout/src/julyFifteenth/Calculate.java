package julyFifteenth;

public class Calculate {
	private int width;
	private int height;
	private int rad;
	
	static final double PI = Math.PI;

	public Calculate() {
	}


public Calculate(int width, int height, int rad) {
		super();
		this.width = width;
		this.height = height;
		this.rad = rad;
	}
	public void triArea() {
		System.out.println("�ﰢ���� ���� = (" + width + " * " + height + ") / 2 = " + (width*height)/2);
	}

	public void rectArea() {
		System.out.println("�簢���� ���� = " + width + " * " + height + " = " +  (width*height));
	}
	public void rectPeri() {
		System.out.println("�簢���� �ѷ� = (" + width + " + " + height + ") * 2 = " +  (width+height)*2);
		
	}
	public void cirArea() {
		System.out.println("���� ���� = " + rad + " * " + rad + " * PI = " +  (int)(rad*rad*PI));
	}
	public void cirCir() {
		System.out.println("���� �ѷ� = " + 2 + " * " + rad + " * PI = " +  (int)(rad*2*PI));
		
	}
}
