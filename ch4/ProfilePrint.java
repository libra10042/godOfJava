package ch4;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age){
        this.age = age;
    }

    public byte getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMarried(boolean flag){
        this.isMarried = flag;
    }
    public boolean getMarried(){
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint p = new ProfilePrint();
        p.setAge((byte)15);
        p.setName("jin");
        p.setMarried(true);

        System.out.println(p.getAge());
        System.out.println(p.getName());
        System.out.println(p.getMarried());
    }

}
