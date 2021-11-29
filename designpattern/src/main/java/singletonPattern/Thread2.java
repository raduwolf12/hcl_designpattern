package singletonPattern;

/**
 * The Class Thread2.
 */
public class Thread2 extends Thread {
	
	/**
	 * Instantiates a new thread 2.
	 */
	private Thread2() {
	}

	/** The instance. */
	private static Thread2 instance = new Thread2();

	/**
	 * Gets the single instance of Thread2.
	 *
	 * @return single instance of Thread2
	 */
	public static Thread2 getInstance() {
		return instance;
	}

	/**
	 * Run.
	 */
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread2: " + i);
		}
	}

}
