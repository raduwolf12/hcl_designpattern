package singletonPattern;

public class MainApp {

	public static void main(String[] args) {
		Thread t1 = Thread1.getInstance();
		Thread t2 = Thread2.getInstance();

		System.out.println("Starting thread1: ");
		t1.start();
		System.out.println("Starting thread2: ");
		t2.start();
	}

}
