package singletonPattern;

public class Thread2 extends Thread {
	private Thread2() {
	}

	private static Thread2 instance = new Thread2();

	public static Thread2 getInstance() {
		return instance;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread2: " + i);
		}
	}

}
