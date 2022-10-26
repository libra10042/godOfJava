package labs.generic.generic_classes;

public class GenericTester6 {
    public static void main(String[] args) {
        Box6<Integer> box = new Box6<Integer>();

        box.set(Integer.valueOf(10));
        System.out.printf("Integer Value %d\n", box.getData());

        Box6 rawBox = new Box6();

        // No warning
        rawBox = box;
        System.out.printf("Integer Value :%d\n", rawBox.getData());

        // Warning for unchecked invocation to set(T)
        rawBox.set(Integer.valueOf(10));
        System.out.printf("Integer Value : %d\n", rawBox.getData());

        // Warning for unchecked conversion
        box = rawBox;
        System.out.printf("Integer Value :%d\n", box.getData());

    }

}

class Box6<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }
}