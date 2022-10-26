package labs.generic.restrictions_on_generics;

public class GenericTester4 {
    public static void main(String[] args) {
        //type inference
        Box4<Integer> integerBox = new Box4<>();
        //unchecked conversion warning
        Box4<String> stringBox = new Box4<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

class Box4<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
