package labs.thread_safety_unsafety.synchronization.item78.synchronizedEx.problem;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException{
        System.out.println(stopRequested); // false
        Thread backgroundThread = new Thread(() -> {
           int i = 0;
           while(!stopRequested){
               i++;
           }
        });
        backgroundThread.start();


        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
