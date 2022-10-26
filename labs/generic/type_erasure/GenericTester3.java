package labs.generic.type_erasure;

public class GenericTester3 {
    public static void main(String[] args) {
        Box3<Integer> integerBox = new Box3<Integer>();
        Box3<String> stringBox = new Box3<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        printBox(integerBox);
        printBox1(stringBox);
    }

    private static <T extends Box3> void printBox(T box) {
        System.out.println("Integer Value :" + box.get());
    }

    private static <T> void printBox1(T box) {
        System.out.println("String Value :" + ((Box)box).get());
    }
}

class Box3<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}