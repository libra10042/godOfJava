package ch10.overridingAccessModifier;

public class ParentOverridingPrivate {
    public ParentOverridingPrivate() {
        System.out.println("ParentOverridingPrivate Constructor");
    }
    private void getName(){
        System.out.println("ParentOverridingPrivate - printName()");
    }
}
