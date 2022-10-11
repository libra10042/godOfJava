package ch16.anonymous_class;

public class Example2 {

    public static abstract class MyAbstractClass {
        public abstract void doSomething();
    }

    public static void main(String[] args){
        int dd = 0;
        final int ee = 0;
        MyAbstractClass myClass = new MyAbstractClass() {
            private int aa = 0;
            static final int bb = 0;
//            static int cc = 0; // compile error
            @Override
            public void doSomething() {
                System.out.println("doSomething" + aa);
                System.out.println("doSomething" + bb);
//                System.out.println("doSomething" + cc);
                System.out.println("dd : " + dd);
                System.out.println("ee :" + ee);
            }
        };
        myClass.doSomething();
    }
}
