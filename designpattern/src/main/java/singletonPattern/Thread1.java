package singletonPattern;

public class Thread1 extends Thread {
	private Thread1() {
	}

	private static Thread1 instance = new Thread1();

	public static Thread1 getInstance() {
		return instance;
	}

	@Override
	public void run() {
//		try {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread1: " + i);
//				Thread.sleep(1000);
		}
//		} catch (InterruptedException e) {
//			System.out.println("Thread1 interrupted");
//		}
	}

}