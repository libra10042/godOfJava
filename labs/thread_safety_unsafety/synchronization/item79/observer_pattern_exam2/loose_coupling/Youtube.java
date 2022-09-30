package labs.thread_safety_unsafety.synchronization.item79.observer_pattern_exam2.loose_coupling;


/**
 * @see <a href="https://www.baeldung.com/javadoc-see-vs-link">Observer pattern (loose coupling / tight coupling / pull / push)</a>
 */
interface Observer {
    void update(Video video);
}

class Video {
    private String title;
    private String content;
}


public class Youtube {
    private Video video;
    private Observer observer;

    public Youtube(Observer observer){
        this.observer = observer;
    }

    public void newVideo(Video video){
        this.video = video;
        observer.update(video);
    }
}

class SubscriberA implements Observer {
    public void update(Video video){
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