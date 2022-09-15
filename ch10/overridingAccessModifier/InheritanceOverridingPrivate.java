package ch10.overridingAccessModifier;


public class InheritanceOverridingPrivate {
    public static void main(String[] args) {
        /* overridingReturnType package*/
        ChildOverridingPrivate child = new ChildOverridingPrivate();
        /* *Error - printName() method is private type in access modifier */
        // child.printName();
    }
}
