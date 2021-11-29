package doubleCheckedLocking;

/**
 * The Class Counter1.
 */
public class Counter1 extends Thread {

	/** The instance. */
	private static Counter1 instance;

	/**
	 * Instantiates a new counter 1.
	 */
	private Counter1() {
	}

	/**
	 * Gets the single instance of Counter1.
	 *
	 * @return single instance of Counter1
	 */
	public static Counter1 getInstance() {
		if (instance == null) {
			synchronized (Counter1.class) {
				if (instance == null) {
					System.out.println("****************** Creating Thread1 object");
					instance = new Counter1();
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
			System.out.println("Counting from Thread1 " + i);
		}
	}
}
