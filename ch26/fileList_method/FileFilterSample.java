package ch26.fileList_method;

import java.io.File;
import java.io.IOException;

public class FileFilterSample {
    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();
        // String pathName = File.separator + "GodOfJava" + File.separator + "text";
        String pathName = "C:/Users/Administrator/Desktop/GodOfJava/src";
        sample.checkList(pathName);
    }
    public void checkList(String pathName){
        File file;
        try{
            file = new File(pathName);
            // File []mainFileList = file.listFiles();
            File []mainFileList=file.listFiles(new JPGFilenameFilter());
            for(File tempFile : mainFileList){
                System.out.println(tempFile.getName());
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
