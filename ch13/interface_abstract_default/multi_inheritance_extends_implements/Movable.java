package ch13.interface_abstract_default.multi_inheritance_extends_implements;

public interface Movable {
    public default void doSomething(int n){
        System.out.println("doSomething(Movable)");
    }
}
