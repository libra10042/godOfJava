package baeldung.thread_safety.atomic_objects;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private final AtomicInteger counter = new AtomicInteger();

    public void incrementCounter(){
        counter.incrementAndGet();
    }

    public int getCounter(){
        return counter.get();
    }
}
