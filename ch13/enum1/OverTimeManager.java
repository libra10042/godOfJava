package ch13.enum1;

public class OverTimeManager {
    /* 매개변수로 OverTimeValues 라는 enum class를 받았다.*/
    public int getOvertTimeAmount(OverTimeValues value){
        int amount = 0;
        System.out.println(value);
        switch(value){
            case THREE_HOUR:
                amount=18000;
                break;
            case FIVE_HOUR:
                amount=30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount=40000;
                break;
            case WEEKEND_EIGHT:
                amount=60000;
                break;
        }
        return amount;
    }
}
