package ch25.threadclass_extension;

public class NameCalcThread extends Thread{
    private int calcNumber;
    public NameCalcThread(String name, int calcNumber){
        super(name);
        this.calcNumber= calcNumber;
    }
    public void run(){
        calcNumber++;
    }
}
