package julyFifteenth;



public class BankActive {

	public static void main(String[] args) {
		
		BankWork bank = new BankWork();
		while(true) {
			
			
			System.out.print("1.���°���   2. �Ա�    3.���     4.������ȸ  5.��������   6.��ü��ȸ");
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
