package labs.defensive_copy2.solution2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Name> originalNames = new ArrayList<>();
        originalNames.add(new Name("Fafi"));
        originalNames.add(new Name("Kevin"));

        List<Name> crewNames = Collections.unmodifiableList(originalNames); // crewNames: Fafi, Kevin

        originalNames.add(new Name("Sally")); //crewNames: Fafi, Kevin, Sally
    }
}
