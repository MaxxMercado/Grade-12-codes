package Mercado_Recall3;

import java.io.*;
public class Mercado_Teacher {   

    private String teacherName;

    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;    
    }

    public String getTeacherName(){
        return this.teacherName;
    }


    public static void main(String args[])throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Pls Input your teacher name ");
        String teacherName = br.readLine();

        System.out.println("Hi, " + teacherName + "Pls input your data");
        
        Mercado_Teacher Tname = new Mercado_Teacher();
        Tname.setTeacherName(teacherName); 

        System.out.println("Student 1 Name");
        String studentname1 =br.readLine();

        System.out.println("Student 1 Grade");
        String studentgrade1 =br.readLine();
        double _studentgrade1 = Double.parseDouble(studentgrade1);

        System.out.println("Student 2 Name");
        String studentname2 =br.readLine();

        System.out.println("Student 2 Grade");
        String studentgrade2 =br.readLine();
        double _studentgrade2 = Double.parseDouble(studentgrade2);

        Mercado_Student Student = new Mercado_Student();

        Student.setstudentName(studentname1);
        Student.setstudentGrade(_studentgrade1);
        String sname1 = Student.getstudentName();
        Double sgrade1 = Student.getstudentGrade();
       

        Mercado_Student Student2 = new Mercado_Student();
        Student.setstudentName(studentname2);
        Student.setstudentGrade(_studentgrade2);
        String sname2 = Student.getstudentName();
        Double sgrade2 = Student.getstudentGrade();

        System.out.println("Student Name    Grade");
        System.out.println(sname1 + "         " + sgrade1);
        System.out.println(sname2 + "         " + sgrade2);

        
    }

}
