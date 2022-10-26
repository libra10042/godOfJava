package labs.generic.restrictions_on_generics;

public class GenericTester2 {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException {
        Box2<String> stringBox = new Box2<String>();
        add(stringBox, String.class);
    }

    public static <T> void add(Box3<T> box) {
        //compiler error
        //Cannot instantiate the type T
        //T item = new T();
        //box.add(item);
    }

    public static <T> void add(Box2<T> box, Class<T> clazz)
            throws InstantiationException, IllegalAccessException{
        T item = clazz.newInstance();   // OK
        box.add(item);
        System.out.println("Item added.");
    }
}

class Box2<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
