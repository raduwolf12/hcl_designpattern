package singletonPattern;

/**
 * The Class Thread1.
 */
public class Thread1 extends Thread {
	
	/**
	 * Instantiates a new thread 1.
	 */
	private Thread1() {
	}

	/** The instance. */
	private static Thread1 instance = new Thread1();

	/**
	 * Gets the single instance of Thread1.
	 *
	 * @return single instance of Thread1
	 */
	public static Thread1 getInstance() {
		return instance;
	}

	/**
	 * Run.
	 */
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread1: " + i);
		}
	}

}