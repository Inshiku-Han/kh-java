package MemberService;

public class MemberService {
	
	private String id;
	private String password;
	
	public MemberService() {
		
	}
	public void setLogin(String id, String password) {
		this.id = id;
		this.password = password;
	}

	
	public boolean getLogin(String id, String password) {
		boolean check = false;
		if(this.id.equals("hong") && this.password.contentEquals("12345")) {
			check = true;
		}
		return check;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
