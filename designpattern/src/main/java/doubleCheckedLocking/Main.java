package doubleCheckedLocking;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter1 t1 = Counter1.getInstance();
        Counter2 t2 = Counter2.getInstance();

        System.out.println("Starting thread1: ");
        t1.start();
        System.out.println("Starting thread2: ");
        t2.start();

        System.out.println("Thread 1 name: " + t1.getName());
        Counter1 t3 = Counter1.getInstance();
        System.out.println("Thread 3 name: " + t3.getName());

        System.out.println("Thread 2 name: " + t2.getName());
        Counter2 t4 = Counter2.getInstance();
        System.out.println("Thread 4 name: " + t4.getName());

    }
}
