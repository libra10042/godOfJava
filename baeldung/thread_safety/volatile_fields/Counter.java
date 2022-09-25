package baeldung.thread_safety.volatile_fields;

public class Counter {

    private volatile int counter;

    public Counter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }
}
