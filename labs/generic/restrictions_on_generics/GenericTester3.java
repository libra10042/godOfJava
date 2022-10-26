package labs.generic.restrictions_on_generics;

public class GenericTester3 {
    public static void main(String[] args) {
        Box3<Integer> integerBox = new Box3<Integer>();
        Box3<String> stringBox = new Box3<String>();

//        integerBox.add(new Integer(10));
        printBox(integerBox);
    }

    private static void printBox(Box3 box) {
//        System.out.println("Value: " + box.get());
    }
}

class Box3<T> {
//    //compiler error
//    private static T t;
//
//    public void add(T t) {
//        this.t = t;
//    }
//
//    public T get() {
//        return t;
//    }
}
