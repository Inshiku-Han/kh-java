package fieldClass;

public class Tv { //�̰��� ���赵. �����Ų�ٴ� ������ �ƴϴ�.(���θ޼ҵ尡 ������ ������ �ȵ�). �� ���θ޼ҵ�-���� ���
	// �Ӽ� - ����
	String color; // ����. ��ü�� �ٷ�� ���� �������� ����
	int channel; // ä��. ��ü�� �ٷ�� ���� �������� ����
	boolean power; // �������� true -> on / false -> off
	// ��� - �޼ҵ�
	// ���� on/off
	public void onOff() { //static�� static�޼ҵ忡 �� �� ���
		power = !power;  // ��� ���
	}
	// ä�� ���̱�
	public void channelUp() {
		channel = channel + 1;
	}
	// ä�� ���߱�
	public void channelDown() {
		channel = channel - 1;
	}
	
	//���� Ŭ���� �ȿ� �ִ� ����3��, �޼ҵ�3���� ����� �θ���. ��������� �ʵ�� �θ���.��
	//�޼ҵ� �ȿ� �ִ� ������ ����� �ʵ�� �θ��� �ʴ´�.(��������)
	//��������� �ڵ� �ʱ�ȭ
}
