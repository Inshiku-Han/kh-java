package Thr;

public class Exam02 {

	public static void main(String[] args) {
		Thread task = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0) {
					System.out.println("taskÀÇ " + i + " ");
				}
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread task2 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				if (i % 2 != 0) {
					System.out.println("task2ÀÇ " + i + " ");
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		task.start();
		task2.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("mainÀÇ " + i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
