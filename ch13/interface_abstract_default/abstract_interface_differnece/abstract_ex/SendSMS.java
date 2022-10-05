package ch13.interface_abstract_default.abstract_interface_differnece.abstract_ex;

public abstract class SendSMS {
    abstract public void establishConnectionWithYourTower();

    public void sendSMS(){
        establishConnectionWithYourTower();
        checkIfDoNotDisturbMode();
        // -- SMS 보내기 --
        destroyConnectionWithYourTower();
    }

    abstract public void destroyConnectionWithYourTower();

    public void checkIfDoNotDisturbMode(){
        // 추상클래스 안에서 구현
    }
}

class Vodafone extends SMSSender{
    @Override
    public void establishConnectionWithYourTower() {
        // Vodafone 방식으로 커넥션 맺기
    }

    @Override
    public void destroyConnectionWithYourTower() {
        // Vodafone 방식으로 커넥션 종료
    }
}

class Airtel extends SMSSender  {
    @Override
    public void establishConnectionWithYourTower() {
    }

    @Override
    public void destroyConnectionWithYourTower() {
    }
}