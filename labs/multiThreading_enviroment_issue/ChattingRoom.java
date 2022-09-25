package labs.multiThreading_enviroment_issue;

import ch10.Polymorphism.Parent;

/**
 * @see <a href="https://velog.io/@indongcha/Thread-Safety-%EC%82%B4%ED%8E%B4%EB%B3%B4%EA%B8%B0">Multi Threading 환경에서의 Issue</a>
 */
public class ChattingRoom {
    private int count = 0;

    public void enter(){
        count++; // 채팅방에서 들어오면 인원을 증가시킨다.
    }

    public long getCount(){
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        final ChattingRoom chattingRoom = new ChattingRoom();
        UserEntrance entrance = new UserEntrance(chattingRoom);
        UserEntrance entrance2 = new UserEntrance(chattingRoom);
        UserEntrance entrance3 = new UserEntrance(chattingRoom);
        entrance.start();
        entrance2.start();
        entrance3.start();
        Thread.sleep(10000);
        System.out.println("채팅방 인원 수 = " + chattingRoom.getCount());
        System.out.println("end");
    }
}
