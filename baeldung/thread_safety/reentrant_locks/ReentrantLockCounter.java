package baeldung.thread_safety.reentrant_locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCounter {

    private int counter;
    private final ReentrantLock  reLock = new ReentrantLock(true);

    public void incrementCounter(){
        reLock.lock();
        try {
            counter += 1;
        } finally {
            reLock.unlock();
        }
    }

    public ReentrantLockCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public ReentrantLock getReLock() {
        return reLock;
    }
}
