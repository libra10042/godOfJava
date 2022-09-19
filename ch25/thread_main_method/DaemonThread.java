package ch25.thread_main_method;

public class DaemonThread extends Thread{
    public void run(){
        try {
            Thread.sleep(Long.MAX_VALUE);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
