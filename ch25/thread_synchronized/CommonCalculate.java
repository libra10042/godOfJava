package ch25.thread_synchronized;

public class CommonCalculate {
    private int amount;
    public CommonCalculate(){
        amount = 0;
    }
    public void plus(int value){
        amount+=value;
    }
    public void minus(int value){
        amount-=value;
    }
    public int getAmount(){
        return amount;
    }
}
