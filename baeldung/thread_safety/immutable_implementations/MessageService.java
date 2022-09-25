package baeldung.thread_safety.immutable_implementations;

public class MessageService {

    private final String message;

    public MessageService(String message){
        this.message = message;
    }

    // standard getter

}
