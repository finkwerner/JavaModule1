package org.example;

class Classes2 {

        String subject;
        String level;
        int durationHR;
        }
public class Objects {
    public static void main(String[] args) {
        Classes Java1 = new Classes();   //Constructor


        Java1.subjects = "Java";
        Java1.level = "Basics";
        Java1.durationHR = 24;

        Classes Python1 = new Classes();

        System.out.println("We are learning " + Java1.subjects + " " + Java1.subjects + "after learning" + Python1.subjects);
        System.out.println("The " + Java1.subjects + " course, has a duration of " + Java1.durationHR + " hours");

         System.out.println(Python1.durationHR);



    }
}
