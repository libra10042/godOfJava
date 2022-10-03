package ch5;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager manager = new SalaryManager();
        System.out.println("Real monthlySalary :" + manager.getMonthlySalary(45_000_000));
    }

    /**
     * @param yearlySalary 연봉
     */
    public double getMonthlySalary(int yearlySalary){
        double monthlySalary = yearlySalary/12.0;
        System.out.println("Monthly salary original : " + monthlySalary);

        double tax = calculateTax(monthlySalary);
        double nationalPension = calculateNationalPension(monthlySalary);
        double healthInsurance = calculateHealthInsurance(monthlySalary);
        double minusTotal = tax+nationalPension+healthInsurance;

        System.out.println("Tax per month : " + tax);
        System.out.println("NationalPension per month : " + nationalPension);
        System.out.println("HealthInsurance per month : " + healthInsurance);

        monthlySalary -= minusTotal;

        return monthlySalary;
    }

    /**
     * @param monthlySalary 한달 급여
     */
    public double calculateTax(double monthlySalary){
        double tax = monthlySalary*(12.5/100);
        return tax;
    }

    /**
     * @param monthlySalary 한달 급여
     */
    public double calculateNationalPension(double monthlySalary){
        double nationalPension = monthlySalary*(8.1/100);
        return nationalPension;
    }

    /**
     * @param monthlySalary 한달급여
     */
    public double calculateHealthInsurance(double monthlySalary){
        double healthInsurance = monthlySalary*(13.5/100);
        return healthInsurance;
    }

}
