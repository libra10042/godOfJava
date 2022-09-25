package labs.thread_safety_unsafety;
/**
 * @see <a href="https://velog.io/@guswlsapdlf/Java-Thread-Safety-Unsafety">Java Thread Safety & Unsafety</a>
 */
public class CommonCalculate {
    private int amount;
    public CommonCalculate(){
        amount = 0;
    }

    public synchronized void plus(int value){
        amount += value;
    }

    public int getAmount(){
        return amount;
    }
}
