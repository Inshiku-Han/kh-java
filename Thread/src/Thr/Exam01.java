package Thr;


//�����带 �����ϴ� ���
//1. Runnable�� ������ �ν��Ͻ� ����
//2. Thread �ν��Ͻ� ����
//3. start �޼ҵ� ȣ��


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
		
		//Runnable �������̽��� ������ Ŭ������ ��ü
		Runnable thread = new myThread();
		Thread t = new Thread(thread);
		t.start();
		
		Thread lambdaT = new Thread(()->System.out.println("���ٷ� �ϸ� "+Thread.currentThread().getName()));
		lambdaT.start();
		
		System.out.println("���� ��");
		
	}
	
}


class myThread implements Runnable{
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Ŭ���� ���� " + name);
		
	}
}