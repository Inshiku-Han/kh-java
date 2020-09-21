package haninsik01;

import java.util.Scanner;

public class Member {
private String name;
private String account;
private int password;
private int age;

public Member() {
	name = null;
	account = null;
	password = 0;
	age = 0;
}
public Member(String account,int password) {
	
	this.account = account;
	this.password = password;
}
public Member(String name, String account, int password, int age) {
	this.name = name;
	this.account = account;
	this.password = password;
	this.age = age;
}
public void login() {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.print("���̵� : ");
		String account = sc.nextLine();
	if(this.account.equals(account)) {
		break;
		
	}else {
		System.out.println("���̵� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
	}
	}
	while(true) {
		System.out.print("��й�ȣ : ");
		int password = sc.nextInt();
		if(this.password == password) {
			System.out.println("�α����߽��ϴ�.");
			sc.close();
			return;
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}
	
}

public void display() {
	System.out.println("�̸� : " + name);
	System.out.println("���̵� : " + account);
	System.out.println("�н����� : " + password);
	System.out.println("���� : " + age);
}
}
