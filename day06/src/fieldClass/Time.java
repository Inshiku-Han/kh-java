package fieldClass;

public class Time {
	int hour; // ��
	int minute; // ��
	int second; // ��
	
	//�ð��� ����
	public void setHour(int h) {
		if(h < 0 || h > 23) {
			System.out.println("�߸��� ���Դϴ�. �ð��� ������� �ʾҽ��ϴ�.");
			return; // ��������
		}
		hour = h;
		
		
			
		
	}
	//���� ����
	public void setMinute(int m) {
		minute = m;
	}
	//�ʸ� ����
	public void setSecond(int s) {
		second = s;
		
	}
	//�ð��� ���
	public void displayTime() {
		System.out.println("���� �ð��� " + hour + "�� " + minute + "�� " + second + "�� �Դϴ�.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
