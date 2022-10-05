package ch13.interface_abstract_default.multi_inheritance_interface_implements;

public class Car implements  Vehicle, Movable{

    @Override
    public void doSomething(int n) {
        Vehicle.super.doSomething(n);
        Movable.super.doSomething(n);
        System.out.println("doSomeThing(Car)");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.doSomething(10);
    }

}
