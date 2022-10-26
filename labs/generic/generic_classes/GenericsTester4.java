package labs.generic.generic_classes;

public class GenericsTester4 {
    public static void main(String[] args) {

        Box4<Integer, String> box = new Box4<Integer, String>();
        box.add(Integer.valueOf(10), "Hello World");
        System.out.printf("Integer Value :%d\n", box.getFirst());
        System.out.printf("String Value :%s\n", box.getSecond());

        Box4<String, String> box1 = new Box4<String, String>();
        box1.add("Message", "Hello World");
        System.out.printf("String Value :%s\n", box1.getFirst());
        System.out.printf("String Value :%s\n", box1.getSecond());
    }
}

class Box4<T, S> {
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