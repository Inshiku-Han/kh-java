package julyFifteenth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankWork{
private List<ClientInfo> clientList;
static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}
	public BankWork() {
	 clientList = new ArrayList<>();
		
	}
	public void createAccount() {
		System.out.println("계좌개설을 시작합니다.");
		clientList.add(createClient());
	}
	public void deposit() {
		System.out.print("입금계좌번호 : ");
		sc.nextLine();
		String accountNumber = sc.nextLine();

		for(int i = 0; i < clientList.size(); i++) {
			if(clientList.get(i).getAccount().getAccountNumber().equals(accountNumber)) {
				int money = clientList.get(i).getAccount().getMoney();
				System.out.print("현재 총 예금액은 " + money + "원입니다. ");
				System.out.print("예금액을 입력하세요 : ");
				int inputMoney = sc.nextInt();
				clientList.get(i).getAccount().setMoney(money+inputMoney);
				System.out.print("정상 입금되었습니다. 현재 총 예금액은  " + (money+inputMoney) + "원입니다.");
				System.out.println();
				}
			}
		
	}
	public void withdraw() {
		System.out.print("출금계좌번호 : ");
		sc.nextLine();
		String accountNumber = sc.nextLine();
		
		for(int i = 0; i < clientList.size(); i++) {
			if(clientList.get(i).getAccount().getAccountNumber().equals(accountNumber)) {
				int money = clientList.get(i).getAccount().getMoney();
				System.out.print("현재 총 예금액은" + money + "원입니다. ");
				System.out.print("출금액을 입력하세요 : ");
				int inputMoney = sc.nextInt();
				clientList.get(i).getAccount().setMoney(money-inputMoney);
				System.out.print("정상 출금되었습니다. 현재 총 예금액은 " + (money-inputMoney) + "원입니다. ");
				System.out.println();
			}
		}
		
		
	}
	public void displayAccount() {
		System.out.print("계좌번호 : ");
		sc.nextLine();
		String accountNumber = sc.nextLine();
		for(int i = 0; i < clientList.size(); i++) {
			if(clientList.get(i).getAccount().getAccountNumber().equals(accountNumber)) {
			int money = clientList.get(i).getAccount().getMoney();
			System.out.print("현재 총 예금액은 " + money + "원입니다. ");
			System.out.println();
			}
		}
	}
	public void deleteAccount() {
		System.out.print("해지계좌번호 : ");
		sc.nextLine();
		String accountNumber = sc.nextLine();
		for(int i = 0; i < clientList.size(); i++) {
			if(clientList.get(i).getAccount().getAccountNumber().equals(accountNumber)) {
				String name = clientList.get(i).getName();
				System.out.println(name + "님의 계좌를 해지합니다..");
				clientList.remove(i);
				System.out.println();
			}
		}
	}
	public void displayAll() {
		for(ClientInfo e : clientList) {
			System.out.println(e);
		}
	}
	private ClientInfo createClient() {
		System.out.print("이름 : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("주민등록번호 : ");
		String myNumber = sc.nextLine();
		System.out.print("연락처 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("계좌번호 : ");
		String accountNumber = sc.nextLine();

		AccountInfo account = new AccountInfo(myNumber, accountNumber);
		ClientInfo client = new ClientInfo(name, myNumber, phoneNumber, account);
		
		return client;
	}
	public void exitProgram() {
		sc.close();
		System.exit(0);
	}
}
