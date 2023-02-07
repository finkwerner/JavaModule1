package org.example;

public class Array {
    public static void main (String[] args){

        //Used to store multiple values in a single variable
        //An Array is composed of Elemnents an each of them has an Index

        int[] grades = {5,6,7,8,9,10};
        System.out.println("The first element is: " + grades[0]);

        String [] progLang = {"C", "C++", "Java", "Python", "JavaScript", "PHP"};

        progLang[1] = "SQL";

        System.out.println(progLang[1]);

         //Alternative way to create an Array

        String [] webServices = new String[3];
        webServices[0] = "XAMPP";
        webServices[1] = "Tomcat";
        webServices[2] = "WildFly";
        System.out.println(webServices[2]);
    }
}
