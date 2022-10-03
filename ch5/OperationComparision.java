package ch5;

public class OperationComparision {
    public static void main(String[] args) {
        OperationComparision operator = new OperationComparision();
        operator.comparision();

        operator.equalsMethod();
    }
    public void comparision(){
        int intValue = 1;
        int intValue2 = 2;
        int intValue3 = 1;

        System.out.println(intValue == intValue2);
        System.out.println(intValue == intValue3);
    }

    public void equalsMethod(){
        String A = "Java"; // literal
        String B = "Java"; // literal
        String C = new String("Java"); // new
        String D = new String("Java"); // new

        System.out.println( A == B );  // true        주소값 : 1000 == 1000
        System.out.println( B == C );  // false       주소값 : 1000 == 2000
        System.out.println( C == D );  // false       주소값 : 2000 == 3000

        System.out.println( A.equals(B) );  // true
        System.out.println( B.equals(C) );  // true
        System.out.println( C.equals(D) );  // true



    }
}
