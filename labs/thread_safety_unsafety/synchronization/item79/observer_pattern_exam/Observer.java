package labs.thread_safety_unsafety.synchronization.item79.observer_pattern_exam;
/**
 * @see <a href="https://coding-factory.tistory.com/710">Observer Pattern</a>
 */
public class Observer {
    public String msg;

    public void receive(String msg){
        System.out.println(this.msg + " 에서 메시지를 받음 ! " + msg);
    }
}
