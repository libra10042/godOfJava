package ch13.enum1;

public class OverTimeMain {
    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();
        int myAmount = manager.getOvertTimeAmount(OverTimeValues.THREE_HOUR);
        System.out.println(myAmount);
    }
}
