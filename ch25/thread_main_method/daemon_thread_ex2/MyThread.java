package ch25.thread_main_method.daemon_thread_ex2;
/**
 * @see <a href="https://www.geeksforgeeks.org/difference-between-daemon-threads-and-user-threads-in-java/">Daemon thread example</a>
 */
public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("User Thread or Non-Daemon Thread");
    }
}
class MainThread{
    public static void main(String[] args)
    {

        MyThread mt = new MyThread();
        // mt.start();

        System.out.println("Main Thread");

        // 데몬이 아닌 스레드를 데몬 스레드로 만들기
        mt.setDaemon(true);

        System.out.println("Is " + mt.getName()
                + " a Daemon Thread: "
                + mt.isDaemon());

        System.out.println("Is " + Thread.currentThread().getName()
                + " a Daemon Thread: "
                + Thread.currentThread().isDaemon());
    }
}
