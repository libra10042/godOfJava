package labs.generic.generic_classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericTester2 {
    public static void main(String[] args) {
        Box2<Integer, String> box = new Box2<Integer, String>();
        box.add(Integer.valueOf(10), "Hello world");
        System.out.printf("Integer Value : %d\n", box.getFirst());
        System.out.printf("String Value : %s\n", box.getSecond());

        Pair<String, Integer> pair = new Pair<String, Integer>();
        pair.addKeyValue("1", Integer.valueOf(10));
        System.out.printf("(Pair)Integer Value :%d\n", pair.getValue("1"));

        CustomList<Box2> list = new CustomList<Box2>();
        list.addItem(box);
        System.out.printf("(CustomList)Integer Value :%d\n", list.getItem(0).getFirst());

    }

}

class Box2<T, S> {
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

class Pair<K,V>{
    private Map<K,V> map = new HashMap<K,V>();

    public void addKeyValue(K key, V value) {
        map.put(key, value);
    }

    public V getValue(K key) {
        return map.get(key);
    }
}

class CustomList<E>{
    private List<E> list = new ArrayList<E>();

    public void addItem(E value) {
        list.add(value);
    }

    public E getItem(int index) {
        return list.get(index);
    }
}