package Thr;


//쓰레드를 생성하는 방법
//1. Runnable을 구현한 인스턴스 생성
//2. Thread 인스턴스 생성
//3. start 메소드 호출


public class Exam01 {
	public static void main(String[] args) {
//		try {
//			for(int i = 0; i < 9; i++) {
//				Thread.sleep(100);
//				System.out.println(i);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String str = Thread.currentThread().getName();
		System.out.println(str);
		
		//Runnable 인터페이스를 구현한 클래스의 객체
		Runnable thread = new myThread();
		Thread t = new Thread(thread);
		t.start();
		
		Thread lambdaT = new Thread(()->System.out.println("람다로 하면 "+Thread.currentThread().getName()));
		lambdaT.start();
		
		System.out.println("메인 끝");
		
	}
	
}


class myThread implements Runnable{
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("클래스 쓰면 " + name);
		
	}
}