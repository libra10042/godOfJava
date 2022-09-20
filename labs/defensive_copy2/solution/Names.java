package labs.defensive_copy2.solution;

import java.util.ArrayList;
import java.util.List;

public class Names {
    private final List<Name> names;

    public Names(List<Name> names){
        /* new ArrayList<>() 를 이용해 원본과의 주소 공유를 끊어 냈다.*/
        this.names = new ArrayList<>(names);
    }
}
