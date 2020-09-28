
public class VOListTest {
	public static void main(String[] args) {
		// 접근제어 public : 다른 패키지내에서 접근 가능
		// default : 같은 패키지안에서 접근 가능
		// private : 해당 클래스 안에서만 접근 가능

		VOList<MyVO> list = new VOList<>();

		list.add(new MemberVO("java","자바", "123"));
		list.add(new BoardVO(1,"게시판","이하 내용"));
		
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
		System.out.println("멤버정보 : 아이디 : " + id + " 이름 : " + name + " 비밀번호 : " + password);
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
		System.out.println("보드정보 : 보드번호 : " + boardNum + " 제목 : " + title + " 내용 : " + content);
	}

}

class MyVO {
	public void display() {

	}
}