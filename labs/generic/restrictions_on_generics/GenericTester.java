package labs.generic.restrictions_on_generics;

public class GenericTester {
    public static void main(String[] args) {
        Box3<Integer> integerBox = new Box3<Integer>();

        //compiler errror
        //ReferenceType
        //- Syntax error, insert "Dimensions" to complete
        // ReferenceType
        //Box<int> stringBox = new Box<int>();

//        integerBox.add(new Integer(10));
        printBox(integerBox);
    }

    private static void printBox(Box3 box) {
//        System.out.println("Value: " + box.get());
    }

}

class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
