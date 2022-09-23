package ch21.generic_wildcard.problem;

import ch21.generic_wildcard.exam.WildcardGeneric;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }
    public void callWildcardMethod(){
        /* Error : incompatible types: java.lang.String cannot be converted to capture#1 of ? */
        // WildcardGeneric<?> wildcard = new WildcardGeneric<String>();
        // wildcard.setWildcard("A");
        // wildcardStringMethod(wildcard);
    }
    public void wildcardStringMethod(WildcardGeneric<?> c){
        Object value = c.getWildcard();
        if(value instanceof String){
            System.out.println(value);
        }
    }
}
