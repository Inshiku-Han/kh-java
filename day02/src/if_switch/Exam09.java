package if_switch;

public class Exam09 {

	public static void main(String[] args) {
		//���׿�����
		int num = 5;
		int result = 0;
		if(num > 3) {
			result = 10;
		}else {
			result = 20;
		}
		
		result = (num > 3) ? 10 : 20; // ���̸� 10, �����̸� 20 ����
		
		System.out.println(result);
	}

}
