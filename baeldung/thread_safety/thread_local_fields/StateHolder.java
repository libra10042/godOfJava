package baeldung.thread_safety.thread_local_fields;

public class StateHolder {

    private final String state;

    public StateHolder(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
