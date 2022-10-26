package labs.generic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericTester2 {
    public static void main(String[] args) {
        // Syntax :Set<T> set = new HashSet<T>();
        Set<Integer> integerSet = new HashSet<Integer>();

        integerSet.add(Integer.valueOf(10));
        integerSet.add(Integer.valueOf(11));

        Set<String> stringSet = new HashSet<String>();

        stringSet.add("Hello World");
        stringSet.add("Hi World");


        for(Integer data: integerSet) {
            System.out.printf("Integer Value :%d\n", data);
        }

        Iterator<String> stringIterator = stringSet.iterator();

        while(stringIterator.hasNext()) {
            System.out.printf("String Value :%s\n", stringIterator.next());
        }
    }
}
