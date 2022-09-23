package ch21.generic_type_range;

import ch21.generic_wildcard.exam.WildcardGeneric;

public class CarWildcarSample {
    public static void main(String[] args) {
        CarWildcarSample sample = new CarWildcarSample();
        sample.callBoundeWildcardMethod();

        sample.callBusBoundedWildcarMethod();
    }
    public void callBoundeWildcardMethod(){
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Car("Mustang"));
        boundedWildcardMethod(wildcard);
    }
    public void callBusBoundedWildcarMethod(){
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildcard(new Bus("6900"));
        boundedWildcardMethod(wildcard);
    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c){
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
