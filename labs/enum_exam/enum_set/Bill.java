package labs.enum_exam.enum_set;

import java.util.EnumSet;

/* Fixed Costs */
enum FC {
    UTILITIES(300000), SAVINGS(1000000), LOAN(800000), CREDIT(500000), DONATION(200000);

    private int value;

    FC(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
public class Bill {

    public static void main(String[] args) {
        EnumSet<FC> bh1, bh2, bh3, bh4, bh5;

        bh1 = EnumSet.allOf(FC.class);
        bh2 = EnumSet.of(FC.UTILITIES, FC.SAVINGS, FC.LOAN, FC.CREDIT);
        bh3 = EnumSet.complementOf(bh2);

        /* IllegalArgumentException: LOAN > SAVINGS  */
        // bh4 = EnumSet.range(FC.LOAN, FC.SAVINGS);
        bh4 = EnumSet.range(FC.SAVINGS, FC.LOAN);
        bh5 = EnumSet.noneOf(FC.class);
        bh5.add(FC.UTILITIES);
        bh5.add(FC.CREDIT);
        bh5.add(FC.UTILITIES);

        System.out.println("bh1 : " + bh1);
        System.out.println("bh2 : " + bh2);
        System.out.println("bh3 : " + bh3);
        System.out.println("bh4 : " + bh4);
        System.out.println("bh5 : " + bh5);
    }
}
