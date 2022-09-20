package labs.unmodifiable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @see <a href="https://www.javatpoint.com/java-collections-unmodifiablelist-method">unmodifiableList example</a>
 */
public class CollectionsUnmodifiableListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Google", "Mozila FireFox", "Yahoo");
        List<String> list2 = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + list2);
        list2.add("Safari");
    }
}
