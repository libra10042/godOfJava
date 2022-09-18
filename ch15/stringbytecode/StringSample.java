package ch15.stringbytecode;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
        System.out.println("----------------");
        sample.convertUTF16();
        System.out.println("----------------");
        sample.convert2UTF16();
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

    public void printByteArray(byte[] array){
        for(byte data : array){
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public void convertUTF16(){
        try{
            String korean = "한글";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void convert2UTF16(){
        try{
            String korean = "한글";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korea2 = new String(array1, "UTF-16");
            System.out.println(korea2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
