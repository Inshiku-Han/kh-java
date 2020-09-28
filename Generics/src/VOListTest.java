
public class VOListTest {
	public static void main(String[] args) {
		// �������� public : �ٸ� ��Ű�������� ���� ����
		// default : ���� ��Ű���ȿ��� ���� ����
		// private : �ش� Ŭ���� �ȿ����� ���� ����

		VOList<MyVO> list = new VOList<>();

		list.add(new MemberVO("java","�ڹ�", "123"));
		list.add(new BoardVO(1,"�Խ���","���� ����"));
		
		list.get();
	}
}

class MemberVO extends MyVO {
	private String id;
	private String name;
	private String password;

	public MemberVO() {
		super();
	}

	public MemberVO(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public void display() {
		System.out.println("������� : ���̵� : " + id + " �̸� : " + name + " ��й�ȣ : " + password);
	}

}

class BoardVO extends MyVO {
	private int boardNum;
	private String title;
	private String content;

	public BoardVO() {
		super();
	}

	public BoardVO(int boardNum, String title, String content) {
		super();
		this.boardNum = boardNum;
		this.title = title;
		this.content = content;
	}

	public void display() {
		System.out.println("�������� : �����ȣ : " + boardNum + " ���� : " + title + " ���� : " + content);
	}

}

class MyVO {
	public void display() {

	}
}