package baeldung.thread_safety.synchronized_method.synchronized_method;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread thread1 = new Thread( () -> {
            a.run("thread1");
        });
        Thread thread2= new Thread( () -> {
            a.run("thread2");
        });
        thread1.start();
        thread2.start();
    }
}
