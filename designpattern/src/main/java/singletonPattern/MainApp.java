package singletonPattern;

/**
 * The Class MainApp.
 */
public class MainApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Thread t1 = Thread1.getInstance();
		Thread t2 = Thread2.getInstance();

		System.out.println("Starting thread1: ");
		t1.start();
		System.out.println("Starting thread2: ");
		t2.start();

		System.out.println("Thread 1 name: " + t1.getName());
		Thread t3 = Thread1.getInstance();
		System.out.println("Thread 3 name: " + t3.getName());

		System.out.println("Thread 2 name: " + t2.getName());
		Thread t4 = Thread2.getInstance();
		System.out.println("Thread 4 name: " + t4.getName());

	}

}
