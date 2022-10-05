package ch13.interface_abstract_default.interface_implements;

public interface Vehicle {
    public default void doSomething(int n){
        System.out.println("doSomething(Vehicle)" + n);
    }
}

