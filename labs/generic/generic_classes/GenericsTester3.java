package labs.generic.generic_classes;

public class GenericsTester3 {
    public static void main(String[] args) {
        // type interface
        Box<Integer> integerBox = new Box<>();
        // unchecked conversion warning
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello world"));

        System.out.printf("Integer Value %d\n", integerBox.get());
        System.out.printf("Integer Value %s\n", stringBox.get());


    }
}

class Box3<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

}