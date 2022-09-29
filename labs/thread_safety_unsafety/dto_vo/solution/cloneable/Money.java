package labs.thread_safety_unsafety.dto_vo.solution.cloneable;
/**
 * @see <a href="https://multifrontgarden.tistory.com/182">DTO & VO</a>
 */
class Money implements Cloneable{

    private long amount;
    private Currency currency;

    public long getAmount(){
        return amount;
    }

    public void setAmount(long amount){
        this.amount = amount;
    }

    public Currency getCurrency(){
        return currency;
    }

    public void setCurrency(Currency currency){
        this.currency = currency;
    }

    @Override
    public String toString(){
        return this.amount + this.currency.getDescription();
    }

    @Override
    public Money clone(){
        try {
            return (Money) super.clone();
        } catch ( CloneNotSupportedException e){
            throw new IllegalStateException("copy fail");
        }
    }
}

enum Currency {
    KRW("원"), DOLLAR("달러");

    private final String description;

    Currency(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
