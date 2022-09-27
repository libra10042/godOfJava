package labs.thread_safety_unsafety.exam1;

public class ModifyAmountThread extends Thread{
    private CommonCalculate calc;
    private boolean addFlag;
    public ModifyAmountThread(CommonCalculate calc, boolean addFlag) {
        this.calc = calc;
        this.addFlag = addFlag;
    }

    public void run() {
        for(int loop=0; loop<10000; loop++){
            if(addFlag){
                calc.plus(1);
            }
        }
    }
}
