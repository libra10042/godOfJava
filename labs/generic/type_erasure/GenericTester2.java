package labs.generic.type_erasure;

public class GenericTester2 {
    public static void main(String[] args) {
        Box2 integerBox = new Box2();
        Box2 stringBox = new Box2();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

class Box2 {
    private Object t;

    public void add(Object t) {
        this.t = t;
    }

    public Object get() {
        return t;
    }
}
