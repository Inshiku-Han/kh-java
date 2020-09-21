package constructor;

//	int Ÿ���� x1, y1, x2, y2 �ʵ� : �簢���� �����ϴ� �� ���� ��ǥ
//	������ 2�� : ����Ʈ �����ڿ� x1, y1, x2, y2�� ���� �����ϴ� ������
//	void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 ��ǥ ����
//	int square() : �簢�� ���� ����
//	void show() : ��ǥ�� ���� �� ���簢�� ������ ȭ�� ���
//	boolean equals(Rectangle r) : ���ڷ� ���޵� ��ü r�� �� ��ü�� ������ ���̸� true ����
public class Rectangle {
	int x1;
	int y1;
	int x2;
	int y2;

	public Rectangle() { // ����Ʈ ������
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}

	public Rectangle(int x1, int y1, int x2, int y2) { // �Ű����� ������
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void set(int x1, int y1, int x2, int y2) { // setter
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int square() { // ���� ����
		return (this.x2 - this.x1) * (this.y2 - this.y1);
	}

	public void show() { // ���
		System.out.println("��ǥ : (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
		System.out.println("���� : " + square());
	}

	// ���ڷ� ���޵� ��ü r�� �� ��ü�� ������ ���̶�� true ����
	// ���� : �Ű������� ������ ��
	public boolean equals(Rectangle r) {

		if (square() == r.square()) {
			return true;

		} else {
			return false;
		}
	}
}
