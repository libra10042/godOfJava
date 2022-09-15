package ch10.castingReferenceType;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        inheritance.objectCast();
    }
    public void objectCast(){
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        /* *error : ClassCastException ParentCasting cannot be cast to ChildCasting */
        ChildCasting child2 = (ChildCasting) parent;
    }
}
