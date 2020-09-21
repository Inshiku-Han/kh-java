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
		System.out.println("���°����� �����մϴ�.");
		clientList.add(createClient());
	}
	public void deposit() {
		System.out.print("�Աݰ��¹�ȣ : ");
		sc.nextLine();
		String accountNumber = sc.nextLine();

		for(int i = 0; i < clientList.size(); i++) {
			if(clientList.get(i).getAccount().getAccountNumber().equals(accountNumber)) {
				int money = clientList.get(i).getAccount().getMoney();
				System.out.print("���� �� ���ݾ��� " + money + "���Դϴ�. ");
				System.out.print("���ݾ��� �Է��ϼ��� : ");
				int inputMoney = sc.nextInt();
				clientList.get(i).getAccount().setMoney(money+inputMoney);
				System.out.print("���� �ԱݵǾ����ϴ�. ���� �� ���ݾ���  " + (money+inputMoney) + "���Դϴ�.");
				System.out.println();
				}
			}
		
	}
	public void withdraw() {
		System.out.print("��ݰ��¹�ȣ : ");
		sc.nextLine();
		String accountNumber = sc.nextLine();
		
		for(int i = 0; i < clientList.size(); i++) {
			if(clientList.get(i).getAccount().getAccountNumber().equals(accountNumber)) {
				int money = clientList.get(i).getAccount().getMoney();
				System.out.print("���� �� ���ݾ���" + money + "���Դϴ�. ");
				System.out.print("��ݾ��� �Է��ϼ��� : ");
				int inputMoney = sc.nextInt();
				clientList.get(i).getAccount().setMoney(money-inputMoney);
				System.out.print("���� ��ݵǾ����ϴ�. ���� �� ���ݾ��� " + (money-inputMoney) + "���Դϴ�. ");
				System.out.println();
			}
		}
		
		
	}
	public void displayAccount() {
		System.out.print("���¹�ȣ : ");
		sc.nextLine();
		String accountNumber = sc.nextLine();
		for(int i = 0; i < clientList.size(); i++) {
			if(clientList.get(i).getAccount().getAccountNumber().equals(accountNumber)) {
			int money = clientList.get(i).getAccount().getMoney();
			System.out.print("���� �� ���ݾ��� " + money + "���Դϴ�. ");
			System.out.println();
			}
		}
	}
	public void deleteAccount() {
		System.out.print("�������¹�ȣ : ");
		sc.nextLine();
		String accountNumber = sc.nextLine();
		for(int i = 0; i < clientList.size(); i++) {
			if(clientList.get(i).getAccount().getAccountNumber().equals(accountNumber)) {
				String name = clientList.get(i).getName();
				System.out.println(name + "���� ���¸� �����մϴ�..");
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
		System.out.print("�̸� : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("�ֹε�Ϲ�ȣ : ");
		String myNumber = sc.nextLine();
		System.out.print("����ó : ");
		String phoneNumber = sc.nextLine();
		System.out.print("���¹�ȣ : ");
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
