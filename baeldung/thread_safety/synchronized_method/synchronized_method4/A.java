package baeldung.thread_safety.synchronized_method.synchronized_method4;

public class A {

    public synchronized void run(String name){
        System.out.println(name + "lock");
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + "unlock");
    }

    public synchronized void print(String name) {
        System.out.println(name + " hi ");
    }
}
