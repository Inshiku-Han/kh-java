package MemberService;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService m = new MemberService();
		m.setLogin("hong", "12345");

		if (m.getLogin("hong", "12345")) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			m.logout("hong");
		} else {
			System.out.println("id Ȥ�� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
