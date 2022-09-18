package ch14.tryCatch;

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBound();
    }
    public void arrayOutOfBound(){
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }
}
