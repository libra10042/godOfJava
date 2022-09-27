package labs.thread_safety_unsafety.exam2_synchronized.problem;

import java.util.concurrent.TimeUnit;

/**
 * @see <a href="https://castlejune.tistory.com/23">synchronized 와 Thread safe</a>
 */
public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(() ->{
           int i = 0;
           while (!stopRequested){
               i++;
           }
        });
        backgroundThread.start();


        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
