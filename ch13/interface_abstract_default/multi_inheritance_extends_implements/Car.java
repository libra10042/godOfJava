package ch13.interface_abstract_default.multi_inheritance_extends_implements;

public class Car implements Vehicle{
    @Override
    public void doSomething(int n){
        System.out.println("doSomething(Car)");
    }
}
