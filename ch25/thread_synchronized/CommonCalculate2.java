package ch25.thread_synchronized;

public class CommonCalculate2 extends Thread{
    private int amount;
    private int interest;
    private Object interestLock = new Object();
    private Object amountLock = new Object();

    public void addInterest(int value){
        synchronized (interestLock){
            interest += value;
        }
    }
    public void plus(int value){
        synchronized (amountLock){
            amount += value;
        }
    }

    public synchronized void minus(int value){ amount -= value; }

    public int getAmount(){
        return amount;
    }
}
