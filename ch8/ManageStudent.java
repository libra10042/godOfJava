package ch8;

public class ManageStudent {
    public static void main(String[] args) {
        Student[] studentList = null;
        ManageStudent ms = new ManageStudent();
        studentList = ms.addStudent();
        ms.printStudents(studentList);
    }

    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "01012341234", "ad@naver.com");
        return student;
    }

    public void printStudents(Student[] student){
        for(Student st : student){
            System.out.println(st);
        }
    }
}
