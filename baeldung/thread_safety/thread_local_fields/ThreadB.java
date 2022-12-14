package baeldung.thread_safety.thread_local_fields;

import java.util.Arrays;
import java.util.List;

public class ThreadB extends Thread{

    private final List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f");

    @Override
    public void run(){
        letters.forEach(System.out::println);
    }
}
