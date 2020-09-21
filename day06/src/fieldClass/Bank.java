package fieldClass;
	//생성자 : 필드를 초기화시켜줌. 클래스 생성시 필수
public class Bank {
	// 계좌번호, 이름, 예금잔액
	String accNumber;
	String name;
	int balance; //필드를 초기화해줘야 하나 필드를 바로 초기화 하는건 안좋다.

	public Bank(/*int a*/) { //생성자. 생성자에 매개변수 선언시 호출할 때 변수 지정해줘야함
		accNumber = null;	 //생성자를 쓰는 경우 : 처음부터 값이 정해진 경우. 생성자가 없을 경우 디폴트생성자를 자동으로 생성(안보임)
		name = null;		//생성자의 이름은 클래스의 이름과 같아야 한다.
		balance = 0;
		
	}

	public void setAcc(String accNumber, String name, int balance) { // setter
		this.accNumber = accNumber; //this.변수는 필드를 의미. 메소드 내 변수와 구분짓기 위해 this.사용
		this.name = name; // 이 메소드에 있는 name변수를 이 클래스에 있는 name에 넣으시오    라는 뜻
		this.balance = balance;
	}
	
}
