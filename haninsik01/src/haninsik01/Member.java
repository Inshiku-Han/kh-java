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
		System.out.print("아이디 : ");
		String account = sc.nextLine();
	if(this.account.equals(account)) {
		break;
		
	}else {
		System.out.println("아이디가 일치하지 않습니다. 다시 입력하세요.");
	}
	}
	while(true) {
		System.out.print("비밀번호 : ");
		int password = sc.nextInt();
		if(this.password == password) {
			System.out.println("로그인했습니다.");
			sc.close();
			return;
		}else {
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
		}
	}
	
}

public void display() {
	System.out.println("이름 : " + name);
	System.out.println("아이디 : " + account);
	System.out.println("패스워드 : " + password);
	System.out.println("나이 : " + age);
}
}
