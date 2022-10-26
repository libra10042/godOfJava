package labs.generic.generic_classes;

import java.util.ArrayList;
import java.util.List;

public class GenericTester5 {
    public static void main(String[] args) {
        Box5<Integer, List<String>> box = new Box5<Integer, List<String>>();

        List<String> messages = new ArrayList<String>();

        messages.add("Hi");
        messages.add("Hello");
        messages.add("Bye");

        box.add(Integer.valueOf(10), messages);
        System.out.printf("Integer Value :%d\n", box.getFirst());
        System.out.printf("String Value :%s\n", box.getSecond());

    }
}

class Box5<T, S> {
    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return t;
    }

    public S getSecond() {
        return s;
    }
}