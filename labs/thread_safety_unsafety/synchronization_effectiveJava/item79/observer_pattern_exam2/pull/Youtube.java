package labs.thread_safety_unsafety.synchronization.item79.observer_pattern_exam2.pull;

import java.util.List;

/**
 * @see <a href="https://www.baeldung.com/javadoc-see-vs-link">Observer pattern (loose coupling / tight coupling / pull / push)</a>
 */
class Video {
    private String title;
    private String content;
}

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}

interface Observer {
    void update(Subject subject);
}

class SubscriberA implements Observer {
    public void update(Subject subject) {
        System.out.println("SubscriberA 영상 알림");
        if(subject instanceof Youtube){
            Youtube youtube = (Youtube) subject;
            Video video = youtube.getVideo();
        }
    }
}

class SubscriberB implements Observer {
    public void update(Subject subject) {
        System.out.println("SubscriberB 영상 알림");
        if(subject instanceof Youtube){
            Youtube youtube = (Youtube) subject;
            Video video = youtube.getVideo();
        }
    }
}

class SubscriberC implements Observer {
    public void update(Subject subject) {
        System.out.println("SubscriberC 영상 알림");
        if(subject instanceof Youtube){
            Youtube youtube = (Youtube) subject;
            Video video = youtube.getVideo();
        }
    }
}

public class Youtube implements Subject{
    private List<Observer> observers;
    private Video video;

    public Youtube(List<Observer> observer){
        this.observers = observer;
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
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    public void newVideo(Video video){
        this.video = video;
        notifyObserver();
    }

    public Video getVideo(){
        return video;
    }
}
