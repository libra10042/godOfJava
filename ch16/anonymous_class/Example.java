package ch16.anonymous_class;

public class Example {

    interface MyInterface {
        void doSomething();
    }

    public static void main(String[] args){

        MyInterface myClass = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("doSomething");
            }
        };
        myClass.doSomething();
    }
}
