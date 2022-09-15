package ch10.Polymorphism;


public class Child extends Parent {
    public Child(){
        System.out.println("Child Constructor");
    }
    public void printName(){
        System.out.println("Child - printName()");
    }
}
