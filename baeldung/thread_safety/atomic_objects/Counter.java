package baeldung.thread_safety.atomic_objects;

public class Counter {

    private int counter = 0;

    public void incrementCounter(){
        counter += 1;
    }

    public int getCounter(){
        return counter;
    }
}
