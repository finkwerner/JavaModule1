package org.example;

public class MainCourses {

    public static void main(String[] args) {
        SubjectsC sub1= new PythonC();
        SubjectsC sub2= new JavaC();


        sub1.courseContent();
        sub1.codeCompiler();
        sub1.courseDuration(48);

        System.out.println();

        sub2.courseContent();
        sub2.codeCompiler();
        sub2.courseDuration(48);

    }
}
