package labs.thread_safety_unsafety.synchronization.item78.volatileEx.problem;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static int nextSerialNumber = 0;

    public static int generateSerialNumber(){
        return nextSerialNumber++;
    }

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(() -> {
            generateSerialNumber();
        });
        Thread backgroundThread2 = new Thread(() -> {
           generateSerialNumber();
        });
        backgroundThread.start();
        backgroundThread2.start();
        System.out.println(nextSerialNumber);
    }

}
