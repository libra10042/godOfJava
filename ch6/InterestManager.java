package ch6;

import java.math.BigDecimal;

/*
* 내 풀이.
* */
public class InterestManager {
    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();

        BigDecimal withdrawal = interestManager.calculateAmount(365, new BigDecimal(1_000_000.000));
        System.out.println(withdrawal);
    }
    /**
     * @param day 예금 거치 기간
     *
     * @return rate 이율
     */
    public BigDecimal getInterestRate(int day){
        BigDecimal rate = new BigDecimal(0.0);
        if(day >=1 && day <= 90){
            rate = new BigDecimal(0.005);
        }else if(day >=91 && day <=180){
            rate = new BigDecimal(0.001);
        }else if(day >=181 && day <= 364){
            rate = new BigDecimal(0.002);
        }else {
            rate = new BigDecimal(0.056);
        }
        return rate;
    }
    /**
     * @param day 예금 거치 기간
     * @param amount 예치 금액.
     *
     * @return total 만기금액
     */
    public BigDecimal calculateAmount(int day, BigDecimal amount) {
        double double_bigNum = amount.doubleValue();
        BigDecimal rate = getInterestRate(day);
        double double_rate = rate.doubleValue();

        double double_result = 0.0;

        for (int i = 1; i <= day; i++) {
            double_result += double_bigNum + (double_bigNum *double_rate);
        }
        BigDecimal result = new BigDecimal(double_result);
        return result;
    }

}
