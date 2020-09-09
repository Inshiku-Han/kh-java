package julyFifteenth;



public class BankActive {

	public static void main(String[] args) {
		
		BankWork bank = new BankWork();
		while(true) {
			
			
			System.out.print("1.계좌개설   2. 입금    3.출금     4.예금조회  5.계좌해지   6.전체조회");
			int menu = BankWork.sc.nextInt();
			switch(menu) {
				case 1 : bank.createAccount();
					break;
				case 2 : bank.deposit();
					break;
				case 3 : bank.withdraw();
					break;
				case 4 : bank.displayAccount();
					break;
				case 5 : bank.deleteAccount();
					break;
				case 6 : bank.displayAll();
					break;
				case 7 : bank.exitProgram();
			}
			System.out.println();
		}
	}

}
