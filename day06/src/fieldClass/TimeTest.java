package fieldClass;

public class TimeTest {
public static void main(String[] args) {
	Time t = new Time(); // new �ڵ��ϼ�
	
	t.displayTime();
    t.hour = 100;
    t.displayTime();
    t.setHour(1000); // �޼ҵ带 ��������μ� ������ ��������
    t.displayTime();
	
}
}
