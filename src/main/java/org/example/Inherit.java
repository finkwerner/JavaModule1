package org.example;

public class Inherit {

    public static void main(String[] args) {

        Module1 Agile = new Module1();
        Agile.infoModule();
        System.out.println("Presented " + Agile.location);
        Agile.display();
        System.out.println("Title " + Agile.subject);
        System.out.println("Course duration is " + Agile.duration + " hours");
        System.out.println("Evaluation consists of " + Agile.Test);
        Agile.endCourse("10.10.2023");


    }
}
