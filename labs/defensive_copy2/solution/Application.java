package labs.defensive_copy2.solution;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Name crew1 = new Name("Fafi");
        Name crew2 = new Name("Kevin");

        List<Name> originalNames = new ArrayList<>();
        originalNames.add(crew1);
        originalNames.add(crew2);

        Names crewNames = new Names(originalNames); // crewNames의 names: Fafi, Kevin

        crew2.setName("Sally"); // crewNames의 names: Fafi, Sally
    }
}
