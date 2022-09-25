package baeldung.thread_safety.synchronized_block;

public class A {

    public static void run(String name){
        synchronized (A.class) {
            System.out.println(name + "lock");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "unlock");
        }
    }
}
