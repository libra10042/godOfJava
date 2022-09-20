package labs.immutable;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ImmutableClass immutableClass = ImmutableClass.createImmutableClass(1,"cool",new Date());
        System.out.println(immutableClass);

        modifyField(immutableClass.getImmutableField1(),immutableClass.getImmutableField2(),immutableClass.getMutableField());
        System.out.println(immutableClass);
    }

    private static void modifyField(Integer immutableField1, String immutableField2, Date mutableField){
        immutableField1 = 2;
        immutableField2 = "kim";
        //가변객체 Date 의 setter 메소드
        mutableField.setTime(2);
    }
}
