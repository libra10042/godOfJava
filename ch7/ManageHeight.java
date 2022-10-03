package ch7;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ManageHeight {

    public static void main(String[] args) {
        ManageHeight mh = new ManageHeight();
        mh.setData();

        mh.printHeight(0);
        mh.printAverage(0);

        int classNo = 0;
        while(classNo < 5){
            System.out.println("Class No : " + (classNo + 1));
            mh.printAverage(classNo);
            classNo++;
        }
    }

    int[][] gradeHeights;

    public void setData(){
        gradeHeights = new int[][]{
            {170, 180,173, 175, 177},
            {160, 165, 167, 186},
            {158, 177, 187, 176},
            {173, 182, 181},
            {170, 180, 165, 177, 122}
        };
    }

    /**
     * @param classNo 반 번호
     * **/
    public void printHeight(int classNo){
        System.out.println("ClassNo. " + classNo);
        for(int i=0; i< 5; i++){
            int height = gradeHeights[classNo][i];
            System.out.println(height);
        }
    }

    /**
    * @param classNo 반 번호
    * **/
    public void printAverage(int classNo){
        double sum = 0.0;
        int length = gradeHeights[classNo].length;
        for(int i = 0; i < length; i++){
            sum += gradeHeights[classNo][i];
        }
        System.out.println(sum/length);
    }
}
