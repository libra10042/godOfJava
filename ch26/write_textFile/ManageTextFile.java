package ch26.write_textFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manager = new ManageTextFile();
        int numberCount = 10;
        String fullPath = "C:/Users/Administrator/Desktop/GodOfJava/text1/text";
        manager.writeFile(fullPath, numberCount);
    }
    public void writeFile(String fileName, int numberCount) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int loop = 0; loop <= numberCount; loop++) {
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }
            System.out.println();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(bufferedWriter!=null){
                try{
                    bufferedWriter.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
