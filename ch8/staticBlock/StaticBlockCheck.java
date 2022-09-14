package ch8.staticBlock;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        check.makeStaticBlockObject();
    }
    public void makeStaticBlockObject(){
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Create block1");
        System.out.println("------------------");
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");

    }
}
