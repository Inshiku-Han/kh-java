package MemberService;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService m = new MemberService();
		m.setLogin("hong", "12345");

		if (m.getLogin("hong", "12345")) {
			System.out.println("로그인 되었습니다.");
			m.logout("hong");
		} else {
			System.out.println("id 혹은 password가 올바르지 않습니다.");
		}
	}

}
