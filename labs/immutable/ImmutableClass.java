package labs.immutable;

import java.util.Date;

/**
 * @see <a href="https://docs.oracle.com/en/java/">Immutable example</a>
 */
public final class ImmutableClass {
    /* Integer 와 String 은 Immutable 객체로 값을 변경하는 Setter 가 없어서 값이 변하지 않는다.*/
    private final Integer immutableField1;
    private final String immutableField2;
    private final Date mutableField;

    private ImmutableClass(Integer immutableField1, String immutableField2, Date mutableField) {
        this.immutableField1 = immutableField1;
        this.immutableField2 = immutableField2;
        this.mutableField = new Date(mutableField.getTime());
    }

    public static ImmutableClass createImmutableClass(Integer immutableField1, String immutableField2, Date mutableField) {
        return new ImmutableClass(immutableField1, immutableField2, mutableField);
    }

    public Integer getImmutableField1() {
        return immutableField1;
    }

    public String getImmutableField2() {
        return immutableField2;
    }

    /*
     * Date 는 가변 객체로 인스턴스 변수의 참조를 return 하지 않는다.
     * 대신에 new 예약어를 사용해서 방어적복사를 수행한다.
     * */
    public Date getMutableField() {
        return new Date(mutableField.getTime());
    }

    @Override
    public String toString() {
        return "immutableField1 = " + immutableField1 + ", immutableField2 = " + immutableField2 + ", mutableField = " + mutableField;
    }
}
