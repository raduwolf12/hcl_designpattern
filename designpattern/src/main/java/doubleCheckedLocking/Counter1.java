package doubleCheckedLocking;

public class Counter1 extends Thread {
    private static  Counter1 instance;

    private Counter1() {
    }

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

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Counting from Thread1 " + i);
        }
    }
}
