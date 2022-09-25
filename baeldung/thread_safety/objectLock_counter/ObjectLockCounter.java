package baeldung.thread_safety.objectLock_counter;

public class ObjectLockCounter {

    private int counter = 0;
    private final Object lock = new Object();

    public void incrementCounter(){
        synchronized (lock) {
            counter += 1;
        }
    }

    public int getCounter() {
        return counter;
    }

    public Object getLock() {
        return lock;
    }
}
