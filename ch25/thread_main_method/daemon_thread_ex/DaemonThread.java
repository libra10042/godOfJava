package ch25.thread_main_method.daemon_thread_ex;

/**
 * @see <a href="https://www.baeldung.com/java-daemon-thread">Daemon thread example</a>
 */
public class DaemonThread {
    public static void main(String[] args) {
        NewThread daemonThread = new NewThread();
        daemonThread.setDaemon(true); // 이 부분이 없으면 종료 되지 않는다.
        daemonThread.start();
    }

}
