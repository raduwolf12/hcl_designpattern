package doubleCheckedLocking;

public class Counter2 extends Thread {
    private static Counter2 instance;

    private Counter2() {
    }

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

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("Counting from Thread2 " + i);
        }
    }
}
