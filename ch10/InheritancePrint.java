package ch10;

import ch10.inheritance.Child;
import ch10.inheritance2.ChildParent;

public class InheritancePrint {
    public static void main(String[] args) {
        /* inheritance package */
        Child child = new Child();
        child.printName();

        System.out.println("--------------");
        /* inheritance package2 */
        ChildParent child2 = new ChildParent();
        child2.printName();
    }
}
