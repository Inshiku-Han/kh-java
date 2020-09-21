package fieldClass;

public class BankTest {
public static void main(String[] args) {
	Bank b = new Bank(/*10*/); // 새로운 생성자를 호출
	b.setAcc("111-111", "자바", 10000);
	b.setAcc("11", "오오", 123);
}
}
