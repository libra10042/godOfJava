package ch10.overridingAccessModifier;


public class ChildOverridingPrivate extends ParentOverridingPrivate {
    public ChildOverridingPrivate(){
        System.out.println("ChildOverriding Constructor");
    }
    private void printName(){
        System.out.println("ChildOverridingPrivate - printName()");
    }
}
