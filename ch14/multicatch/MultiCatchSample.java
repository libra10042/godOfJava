package ch14.multicatch;

public class MultiCatchSample {
    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        sample.multiCatch();
    }
    public void multiCatch(){
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        }catch(NullPointerException e){
            System.out.println("NullPointerException occurred");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }catch(Exception e){
            System.out.println(intArray.length);
        }
    }
}
