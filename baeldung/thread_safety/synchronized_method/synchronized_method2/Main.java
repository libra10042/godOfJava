package baeldung.thread_safety.synchronized_method.synchronized_method2;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        Thread thread1 = new Thread( () -> {
            a1.run("thread1");
        });
        Thread thread2= new Thread( () -> {
            a2.run("thread2");
        });
        thread1.start();
        thread2.start();
    }
}
