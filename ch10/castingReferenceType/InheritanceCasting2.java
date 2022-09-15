package ch10.castingReferenceType;

public class InheritanceCasting2 {
    public static void main(String[] args) {
        InheritanceCasting2 inheritance = new InheritanceCasting2();
        inheritance.objectCast();
    }
    public void objectCast(){
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting)parent2;
    }
}
