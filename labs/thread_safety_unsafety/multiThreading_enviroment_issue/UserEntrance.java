package labs.thread_safety_unsafety.multiThreading_enviroment_issue;

public class UserEntrance extends Thread{
    private final ChattingRoom chattingRoom;

    public UserEntrance(ChattingRoom chattingRoom){
        this.chattingRoom = chattingRoom;
    }

    @Override
    public void run(){
        for(int i = 0; i < 100000; i++){
            chattingRoom.enter(); // 증가
        }
    }
}
