package labs.defensive_copy2.solution2;

import java.util.ArrayList;
import java.util.List;

public class Names {
    private final List<Name> names;

    public Names(List<Name> names){
        this.names = new ArrayList<>(names);
    }

    public Name getName(int index){
        return this.names.get(index);
    }
}
