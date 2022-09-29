package labs.thread_safety_unsafety.dto_vo.problem;


public class MoneyMain {
    public static void main(String[] args) {
        Money money = new Money();
        money.setAmount(100);
        money.setCurrency(Currency.KRW);


        Money money2 = money;
        money2.setCurrency(Currency.DOLLAR);

        System.out.println(money);
        System.out.println(money2);
    }
}
