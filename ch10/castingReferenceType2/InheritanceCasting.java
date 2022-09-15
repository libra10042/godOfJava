package ch10.castingReferenceType2;

import ch10.castingReferenceType.ChildCasting;
import ch10.castingReferenceType.ParentCasting;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        // inheritance.objectCast();
        // inheritance.objectCast2();
        inheritance.objectCastArray();
    }
    public void objectCastArray(){
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ParentCasting();
        objectTypeCheck(parentArray);

        System.out.println(parentArray[0] instanceof ParentCasting);
    }

    private void objectTypeCheck(ParentCasting[] parentArray){
        for(ParentCasting tempParent : parentArray){
            if(tempParent instanceof ChildCasting){
                System.out.println("ChildCasting");
                ChildCasting tempChild = (ChildCasting) tempParent;
                tempChild.printAge();
            }else if(tempParent instanceof ParentCasting){
                System.out.println("ParentCasting");
            }
        }
    }


}
