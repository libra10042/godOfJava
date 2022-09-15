package ch10.inheritance3;

public class ChildArg extends ParentArg{
    public ChildArg() {
        super("ChildArg");

        /* error code*/
        // super(null);
        System.out.println("Child constructor");
    }
}
