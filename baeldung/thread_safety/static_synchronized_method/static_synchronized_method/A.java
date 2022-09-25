package baeldung.thread_safety.static_synchronized_method.static_synchronized_method;

public class A {

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
