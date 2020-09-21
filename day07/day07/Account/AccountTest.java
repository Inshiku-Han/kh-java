package Account;

public class AccountTest {
	//static을 활용해보자
	public static void main(String[] args) {
		Account a1 = new Account("김형진", 3);
		a1.display();
		
		
		Account a2 = new Account("이형진",10);
		a2.display();

		Account.leverage = 20; // Account클래스안에 있는 공용변수 leverage에 20을 초기화. 공통으로 사용되는 값을 줄 때 쓰임
		a1.display();
		a2.display();
	}

}
