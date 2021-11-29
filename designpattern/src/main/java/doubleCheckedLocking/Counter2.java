package doubleCheckedLocking;

/**
 * The Class Counter2.
 */
public class Counter2 extends Thread {

	/** The instance. */
	private static Counter2 instance;

	/**
	 * Instantiates a new counter 2.
	 */
	private Counter2() {
	}

	/**
	 * Gets the single instance of Counter2.
	 *
	 * @return single instance of Counter2
	 */
	public static Counter2 getInstance() {
		if (instance == null) {
			synchronized (Counter2.class) {
				System.out.println("****************** Creating Thread2 object");
				if (instance == null) {
					instance = new Counter2();
				}
			}
		}
		return instance;
	}

	/**
	 * Run.
	 */
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Counting from Thread2 " + i);
		}
	}
}
