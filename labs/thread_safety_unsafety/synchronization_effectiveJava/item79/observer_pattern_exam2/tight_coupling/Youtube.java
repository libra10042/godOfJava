package labs.thread_safety_unsafety.synchronization.item79.observer_pattern_exam2.tight_coupling;

/**
 * @see <a href="https://www.baeldung.com/javadoc-see-vs-link">Observer pattern (loose coupling / tight coupling / pull / push)</a>
 */
class Video {
    private String title;
    private String content;
}

public class Youtube {
    private Video video;
    private SubscriberA subscriberA;
    private SubscriberB subscriberB;
    private SubscriberC subscriberC;

    public Youtube(SubscriberA subscriberA, SubscriberB subscriberB, SubscriberC subscriberC) {
        this.subscriberA = subscriberA;
        this.subscriberB = subscriberB;
        this.subscriberC = subscriberC;
    }

    public void newVideo(Video video) {
        this.video = video;
        subscriberA.update(video);
        subscriberB.update(video);
        subscriberC.update(video);
    }

}

class SubscriberA {
    public void update(Video video) {
        System.out.println("SubscriberA 영상 알림");
    }
}

class SubscriberB {
    public void update(Video video) {
        System.out.println("SubscriberB 영상 알림");
    }
}

class SubscriberC {
    public void update(Video video) {
        System.out.println("SubscriberC 영상 알림");
    }
}
