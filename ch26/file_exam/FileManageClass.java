package ch26.file_exam;


import java.io.File;
import java.io.IOException;

public class FileManageClass {
    public static void main(String[] args) {
        FileManageClass sample = new FileManageClass();
        // String pathName = File.separator + "GodOfJava" + File.separator + "text1";
        String pathName = "C:/Users/Administrator/Desktop/GodOfJava";

        String fileName = "text";

        sample.checkFile(pathName, fileName);
    }
    public void checkFile(String pathName, String fileName){
        File file = new File(pathName, fileName);
        try{
            if(file.createNewFile()){
                System.out.println("파일 생성 : " +file.getName());
                getFileInfo(file);
            }else{
                System.out.println("같은 이름의 파일이 이미 존재합니다.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void getFileInfo(File file) throws IOException {
        System.out.println("Absolute path = " + file.getAbsolutePath());
        System.out.println("Absolute file = " + file.getAbsoluteFile());
        System.out.println("Canonical path = " + file.getCanonicalPath());
        System.out.println("Canonical file = " + file.getCanonicalPath());

        System.out.println("Name = " + file.getName());
        System.out.println("Path = " + file.getPath());
    }
}
