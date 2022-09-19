package ch25.thread_main_method.daemon_thread_ex;

public class NewThread extends Thread{
    public void run(){
        try {
            Thread.sleep(Long.MAX_VALUE);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
