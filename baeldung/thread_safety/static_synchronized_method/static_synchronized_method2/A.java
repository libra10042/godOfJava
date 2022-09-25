package baeldung.thread_safety.static_synchronized_method.static_synchronized_method2;

public class A {

    public synchronized void print(String name){
        System.out.println(name + " hi");
    }

    public static synchronized void run(String name){
        System.out.println(name + "lock");
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + "unlock");
    }
}
