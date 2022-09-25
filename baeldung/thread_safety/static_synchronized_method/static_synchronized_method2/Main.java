package baeldung.thread_safety.static_synchronized_method.static_synchronized_method2;

/**
 * @see <a href="https://jgrammer.tistory.com/entry/Java-%ED%98%BC%EB%8F%99%EB%90%98%EB%8A%94-synchronized-%EB%8F%99%EA%B8%B0%ED%99%94-%EC%A0%95%EB%A6%AC">synchronized 동기화 정리 </a>
 */
public class Main {
    // static synchronized method + synchronized method
    public static void main(String[] args) throws InterruptedException {
        A a1 = new A();
        A a2 = new A();
        Thread thread1 = new Thread( () -> {
            a1.run("thread1");
        });
        Thread thread2= new Thread( () -> {
            a2.print("thread2");
        });
        thread1.start();
        thread2.start();
    }
}
