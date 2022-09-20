package labs.defensive_copy2.problem;

import java.util.ArrayList;
import java.util.List;

public class Names {
    private final List<Name> names;

    /* 방어적 복사를 사용하지 않았을 때 */
    public Names(List<Name> names){
        this.names = names;
    }
}
