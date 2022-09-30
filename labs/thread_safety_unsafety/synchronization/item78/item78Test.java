package labs.thread_safety_unsafety.synchronization.item78;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class item78Test {

    private int sum = 0;

    @DisplayName("1억이 아닌 매번 다른 값이 나온다.")
    @Test
    void name() throws InterruptedException {
        Thread thread1 = new Thread(this::workerThread);
        Thread thread2 = new Thread(this::workerThread);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        assertEquals(sum, 100_000_000);
    }

    private void workerThread(){
        for(int i = 0; i < 25_000_000; i++){
            sum += 2; // Data race 발생.
        }
    }


    @DisplayName("2개의 스레드로 1억개 만들기, synchronized을 이용해 Lock")
    @Test
    void twoThreadSunWithSynchronized() throws InterruptedException {
        Thread thread1 = new Thread(this::workerThreadWithSynchronized);
        Thread thread2 = new Thread(this::workerThreadWithSynchronized);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        assertEquals(sum, 100_000_000);
    }

    private synchronized void workerThreadWithSynchronized(){
        for(int i=0; i < 25_000_000; i++){
            sum += 2;
        }
    }

    private AtomicInteger atomicSum = new AtomicInteger();

    @DisplayName("2개의 스레드로 1억개 만들기, AtomicInteger를 이용 (Lock이 아님 ) ")
    @Test
    void twoThreadSumWithAtomic() throws InterruptedException {
        Thread thread1 = new Thread(this::workerThreadWithAtomic);
        Thread thread2 = new Thread(this::workerThreadWithAtomic);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        assertEquals(atomicSum.get(), 100_000_000);
    }
    private void workerThreadWithAtomic(){
        for(int i = 0; i < 25_000_000; i++){
            atomicSum.addAndGet(2);
        }
    }



}