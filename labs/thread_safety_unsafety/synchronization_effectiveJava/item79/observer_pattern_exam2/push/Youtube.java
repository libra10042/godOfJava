package labs.thread_safety_unsafety.synchronization.item79.observer_pattern_exam2.push;

import java.util.List;

/**
 * @see <a href="https://www.baeldung.com/javadoc-see-vs-link">Observer pattern (loose coupling / tight coupling / pull / push)</a>
 */
class Video {
    private String title;
    private String content;
}

interface Observer {
    void update(Video video);
}

class SubscriberA implements Observer {
    public void update(Video video) {
        System.out.println("SubscriberA 영상 알림");
    }
}

class SubscriberB implements Observer {
    public void update(Video video){
        System.out.println("SubscriberB 영상 알림");
    }
}

class SubscriberC implements Observer {
    public void update(Video video){
        System.out.println("SubscriberC 영상 알림");
    }
}

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}

public class Youtube implements Subject {
    private List<Observer> observers;
    private Video video;

    public Youtube(List<Observer> observers){
        this.observers = observers;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(video);
        }
    }

    public void newVideo(Video video){
        this.video = video;
        notifyObserver();
    }
}


