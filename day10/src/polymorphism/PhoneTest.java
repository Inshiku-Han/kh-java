package polymorphism;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("010-1111-1111", "Nougat");
		phone1.answer();
		phone1.playApp();

//		SmartPhone phone2 = new MobilePhone("010-2222-2222"); �ڽ�Ŭ������ �θ�Ŭ���� ���� x
		MobilePhone phone3 = new SmartPhone("010-2222-2222", "Nougat"); // �θ�Ŭ������ �ڽ�Ŭ���� ���� o
		
		phone3.answer();
//		phone3.playApp();	�θ�Ŭ������ �ڽ�Ŭ������ �����ص� �ڽ��� �޼ҵ� ��� �Ұ�. ����Ϸ��� �������̵� �ʿ�.
		
			

	}

}
