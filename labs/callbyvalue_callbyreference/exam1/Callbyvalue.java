package labs.callbyvalue_callbyreference.exam1;

public class Callbyvalue {
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("swap() 호출 전 : a = " + a + ", b = " + b);

        swap(a, b);
        System.out.println("swap() 호출 후 : a = " + a + ", b = " + b);
    }
}
