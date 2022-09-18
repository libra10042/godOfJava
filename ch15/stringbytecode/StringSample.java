package ch15.stringbytecode;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
    }
    public void convert(){
        try{
            String korean = "한글";
            // 예제 코드가 위치할 부분
            byte[] array1 = korean.getBytes();
            for(byte data : array1){
                System.out.println(data + " ");
            }
            System.out.println();
            String korea2 = new String(array1);
            System.out.println(korea2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
