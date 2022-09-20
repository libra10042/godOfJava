package labs.defensive_copy;

import java.util.List;

public class VIPMembers {
    private final List<Member> members;

    public VIPMembers(List<Member> members){
        this.members = members;
    }
}
