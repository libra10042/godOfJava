package ch25.thread_synchronized;

public class CommonCalculate extends Thread{
    private int amount;
    public CommonCalculate(){
        amount = 0;
    }
    /*public synchronized void plus(int value){
        amount+=value;
    }
    public synchronized void minus(int value){
        amount-=value;
    }*/

    public void plus(int value){
        synchronized (this){
            amount+=value;
        }
    }
    public synchronized void minus(int value){
        amount-=value;
    }

    public int getAmount(){
        return amount;
    }
}
