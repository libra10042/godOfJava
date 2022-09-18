package ch14.trycatch;

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
//        sample.arrayOutOfBound();
        sample.arrayOutOfBoundTryCatch();
    }
    public void arrayOutOfBound(){
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }
    public void arrayOutOfBoundTryCatch(){
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        }catch(Exception e){}
    }
}
