package ch13.interface_abstract_default.abstract_interface_differnece.abstract_ex;

public abstract class SMSSender {
    public void sendSMS(){
        establishConnectionWithYourTower();
        checkIfDoNotDisturbMode();
        // -- SMS 보내기 --
        destroyConnectionWithYourTower();
    }
    public void establishConnectionWithYourTower(){
        // 통신사마다 다르다
    }
    public void checkIfDoNotDisturbMode(){
    }

    public void destroyConnectionWithYourTower(){
        // 통신사마다 다르다
    }
}
