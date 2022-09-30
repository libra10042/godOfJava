package labs.thread_safety_unsafety.synchronization.item79.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Notice {
    private List<Observer> observers = new ArrayList<>();

    // 옵저버에 추가.
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 옵저버에서 제거
    public void detach(Observer observer){
        observers.remove(observer);
    }

    // 옵저버들에게 알림
    public void notifyObservers(String msg){
        for(Observer o : observers){
            o.receive(msg);
        }
    }
}
