package Circle;

	//	������, �޼ҵ�� ���� public, ������ ���� private ���� ���� ����

public class Circle {
	//������, PI
	private int r; // (private ����) �� ����ϸ� �� Ŭ���������� ��밡��. public�� ���� ������ �� ���氡��
					// �������� ������ �޼ҵ带 ���ؼ��� �����ϰ� �ϱ� ���� private�� ���� ���� ����
	 final double PI = 3.14;
	//������
	public Circle() {
		
	}
	//�������� �����ϴ� �޼ҵ�
	public void setR(int r) {
		if(r < 0) { // ���̳ʽ��� ����
			r = r * -1;
		}
		this.r = r;
	}
	//������ ���� �о���� �޼ҵ�
	public int getR() {
		return r;
		
	}
	//���� ���̸� ����ϴ� �޼ҵ�
	public void display() {
		System.out.println("���� �ѷ� = " + (2*r*PI));
	}
}
