package labs.defensive_copy2.problem;

import java.util.ArrayList;
import java.util.List;
/**
 * @see <a href="https://tecoble.techcourse.co.kr/post/2021-04-26-defensive-copy-vs-unmodifiable/">defensive copy</a>
 */
public class Application {
    public static void main(String[] args) {
        /* 방어적 복사를 사용하지 않았을 때. */
        List<Name> orginalNames = new ArrayList<>();
        orginalNames.add(new Name("Fafi"));
        orginalNames.add(new Name("Kevin"));

        Names crewNames = new Names(orginalNames); // crewNames의 names: Fafi, Kevin
        orginalNames.add(new Name("Sally")); // crewNames의 names: Fafi, Kevin, Sally
    }
}
