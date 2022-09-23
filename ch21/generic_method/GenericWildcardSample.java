package ch21.generic_method;

import ch21.generic_wildcard.exam.WildcardGeneric;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample sample = new GenericWildcardSample();
        sample.callGenericMethod();
    }
    public <T> void genericMethod(WildcardGeneric<T> c, T addValue){
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }
    public void callGenericMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMethod(wildcard, "Data");
    }
}
