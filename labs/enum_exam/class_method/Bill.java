package labs.enum_exam.class_method;

/**
 * @see <a href="https://www.baeldung.com/a-guide-to-java-enums">A Guide to Java Enums</a>
 */
public class Bill {
    /* Fixed Costs */
    enum FC {
        UTILITIES(300000), SAVINGS(1000000), LOAN(800000), CREDIT(500000);

        private int value;

        FC(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

        public int Expenditure(){
            switch(this){
                case UTILITIES :
                    return 3000000;
                case SAVINGS :
                    return 1000000;
                case LOAN :
                    return 800000;
                case CREDIT :
                    return 500000;
                default :
                    return 0;
            }
        }

    }

    public String bank_name;
    public String account;
    public String account_number;
    public String name;

    public static void main(String[] args) {
        Bill bill = new Bill();
        /* ordinal method */
        System.out.println(FC.UTILITIES.ordinal());
        System.out.println(FC.SAVINGS.ordinal());
        System.out.println(FC.LOAN.ordinal());
        System.out.println(FC.CREDIT.ordinal());

        /* T[] value */
        FC[] fc = FC.values();
        for(FC fcList : fc){
            System.out.println(fcList);
        }

        /* valueOf method*/
        FC utilities = Enum.valueOf(FC.class, "UTILITIES");
        FC saving = FC.valueOf("LOAN");
        System.out.println(utilities);
        System.out.println(saving);


        System.out.println("예금통장 자동이체 금액 : " + FC.SAVINGS.Expenditure());
        System.out.println("신용카드 자동이체 : " + FC.CREDIT.Expenditure());
        System.out.println("대출 이자 자동이체 : " + FC.LOAN.Expenditure());
        System.out.println("공과금 자동 이체 : " + FC.UTILITIES.Expenditure());

    }

}

