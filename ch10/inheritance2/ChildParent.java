package ch10.inheritance2;

import ch10.inheritance2.Parent;

public class ChildParent extends Parent {
    public ChildParent(){
        System.out.println("ChildPrint Constructor");
    }
    public void printAge(){
        System.out.println("printAge() - 18 month");
    }
}
