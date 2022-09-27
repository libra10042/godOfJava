package labs.thread_safety_unsafety.exam2.solution;

import java.util.concurrent.TimeUnit;

public class Main {

    private static boolean stopRequested;

    private static synchronized void requestStop(){
        stopRequested = true;
    }

    private static synchronized  boolean stopRequested(){
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() ->{
           int i = 0;
            while (!stopRequested()){
                i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }


}
