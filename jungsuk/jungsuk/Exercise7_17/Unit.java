package Exercise7_17;

public class Unit {
	private int x;
	private int y;

	public Unit() {

	}

	public void move(int x, int y) { // �������̵� �� �ڽ��� ���������ڰ� �θ��� ���������ں��� ������ ����.
	}								 // �θ� public - �ڽ� protected���� x       �θ� private - �ڽ� private �̻� ���� ����. �����ص� ����

	public void stop() {
	}
}

class Marine extends Unit { // ����
	int x, y; // ���� ��ġ

	public Marine() {
	}

	public void move(int x, int y) { // ������ ��ġ�� �̵�

	}

	public void stop() { // ���� ��ġ�� ����
	}

	void stimPack() { // �������� ���
	}
}

class Tank extends Unit { // ��ũ
	int x, y; // ���� ��ġ

	public Tank() {
	}

	public void move(int x, int y) { // ������ ��ġ�� �̵�
	}

	public void stop() { // ���� ��ġ�� ����
	}

	void changeMode() { // ���ݸ�带 ��ȯ
	}
}

class Dropship extends Unit { // ���ۼ�
	int x, y; // ���� ��ġ

	public Dropship() {
	}

	public void move(int x, int y) { // ������ ��ġ�� �̵�
	}

	public void stop() { // ���� ��ġ�� ����
	}

	void load() { // ���õ� ����� �¿��
	}

	void unload() { // ���õ� ����� ������
	}
}