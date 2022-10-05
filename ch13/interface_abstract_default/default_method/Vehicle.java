package ch13.interface_abstract_default.default_method;

public interface Vehicle {
    public void doSomething(int n);

    public default void doSomething2(int n){
        System.out.println("doSomething(Vehicle)");
    }
}


