package ch13.enum2;

import org.codehaus.groovy.transform.SourceURIASTTransformation;

public class OverTimeManager2 {
    public static void main(String[] args) {
        OverTimeValues2 values2 = OverTimeValues2.FIVE_HOUR;
        System.out.println(values2);
        System.out.println(values2.getAmount());
    }
}
