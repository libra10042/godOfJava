package ch25.thread_control_method;

public class SleepThread extends Thread{
    long sleepTime;
    public SleepThread(long sleepTime){
        this.sleepTime = sleepTime;
    }
    public void run(){
        try{
            System.out.println("Sleeping " + getName());
            Thread.sleep(sleepTime);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
