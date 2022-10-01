package labs.thread_safety_unsafety.synchronization.item78.volatileEx.solution;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class StopThread {
    private static final AtomicLong nextSerialNumber = new AtomicLong();

    public static long generateSerialNumber(){
        return nextSerialNumber.getAndIncrement();
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
