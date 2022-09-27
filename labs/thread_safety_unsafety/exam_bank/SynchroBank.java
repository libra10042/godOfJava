package labs.thread_safety_unsafety.exam_bank;

import java.util.concurrent.Future;

public class SynchroBank {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread a = new Thread(atm,"충진");
        Thread b = new Thread(atm, "지훈");

        a.start();
        b.start();
    }
}


class ATM implements Runnable {
      private int deposit = 10000; // 계좌 잔액
    @Override
    public void run(){
        synchronized (this) { // synchronized 임계 영역 설정.
            for (int i = 0; i <= 10; i++) { // 1000원씩 5번 출금 시도.
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                if (getMoney() <= 0) {
                    break;
                }
                withdraw(1000);
            }
        }
    }

    // 출금 후 잔액 변경하고 메시지 출력하는 메서드.
    public void withdraw(int money){
        if(getMoney() > 0){
            deposit -= money;
            System.out.println(Thread.currentThread().getName() + " 가 출금합니다. 잔액 " + getMoney());
        } else {
            System.out.println(Thread.currentThread().getName() + " 잔액 부족. ");
        }
    }


    public int getMoney(){
        return deposit;
    }

}