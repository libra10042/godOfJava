package baeldung.thread_safety.synchronized_method.synchronized_method3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a1 = new A();
        Thread thread1 = new Thread( () -> {
            a1.run(" thread1");
        });
        Thread thread2= new Thread( () -> {
            a1.print(" thread2");
        });
        thread1.start();
        Thread.sleep(500);
        thread2.start();
    }
}
