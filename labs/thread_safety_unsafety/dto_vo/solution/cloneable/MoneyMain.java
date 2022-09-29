package labs.thread_safety_unsafety.dto_vo.solution.cloneable;

public class MoneyMain {
    public static void main(String[] args) {
        Money money1 = new Money();
        money1.setAmount(100);
        money1.setCurrency(Currency.KRW);

        Money money2 = money1.clone();
        money2.setCurrency(Currency.DOLLAR);

        System.out.println(money1);
        System.out.println(money2);
    }
}
