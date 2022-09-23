package ch21.generic_wildcard.exam;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }
    public void callWildcardMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }
    public void wildcardStringMethod(WildcardGeneric<String> c){
        String value = c.getWildcard();
        System.out.println(value);
    }
}
