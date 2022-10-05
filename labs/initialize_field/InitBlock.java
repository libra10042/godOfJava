package labs.initialize_field;

public class InitBlock {
    static int classVar = 10; // 클래스 변수의 명시적 초기화
    int instanceVar = 10; // 인스턴스 변수의 명시적 초기화

    static { // 클래스 초기화 블록을 이용한 초기화
        classVar = 20;
    }

    InitBlock() { // 생성자를 이용한 초기화
        instanceVar = 30;
    }
}

class Sample {
    public static void main(String[] args) {
        System.out.println(InitBlock.classVar);
        InitBlock obj = new InitBlock();
        System.out.println(obj.instanceVar);
    }
}
