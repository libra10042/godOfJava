package ch26.read_textFile;

import org.apache.groovy.json.internal.IO;

import java.io.*;

public class ManageTextFile {

    public static void main(String[] args) {
        ManageTextFile manager = new ManageTextFile();
        int numberCount = 10;
        String fullPath = "C:/Users/Administrator/Desktop/GodOfJava/text1/text";
        manager.writeFile(fullPath, numberCount);
        manager.readFile(fullPath);
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
    public void readFile(String fileName){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
            System.out.println("Read success!!!");
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(bufferedReader !=null){
                try{
                    bufferedReader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fileReader !=null) {
                try {
                    fileReader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
