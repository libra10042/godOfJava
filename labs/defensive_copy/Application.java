package labs.defensive_copy;

import java.util.ArrayList;
import java.util.List;
/**
 * @see <a href="https://dev-cool.tistory.com/25">defensive copy</a>
 */
public class Application {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("김씨"));
        memberList.add(new Member("쿨씨"));
        System.out.println(memberList);

        VIPMembers vipMembers = new VIPMembers(memberList);
        memberList.add(new Member("아저씨"));
        System.out.println(memberList);
    }
}
