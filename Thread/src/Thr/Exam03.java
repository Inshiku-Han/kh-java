package Thr;

public class Exam03{
	public static void main(String[] args) {
		TestThread test = new TestThread();
		
		test.start();
		for(int i = 0; i < 20 ; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}


class TestThread extends Thread {
	@Override
	public void run() {
		super.run();
		for(int i = 0; i < 20 ; i ++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}