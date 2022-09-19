package ch25.threadclass_runnableInterface;

public class RunnableSample implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println("This is RunnableSample's run() method.");
    }
}
