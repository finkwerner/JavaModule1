package org.example;

public class Loops {
    public static void main (String[] args) {
        /* Loops:
        -For Loops
        -While loops
        -Do While loops
        -For-Each loops
         */
        //For loop:

        for (int i = 0; i<3; i++) {  //i is a counter or index
            // i<3 is a condition
            System.out.println(i);
        }

            // While loop:

        int i = 0;

        while (i < 2){
            System.out.println("The initial value of wl is 0");
            i++;

        }
        System.out.println(i);

        // For each loop:

        String [] progLang = {"C++", "Java", "Python"};

        for (String prog : progLang) {
            System.out.println(progLang);


        }

        // Do While:

        int wl = 0;

        do {
            System.out.println("The initial value of wl is 0");
            wl++;

        } while  (wl<0);

    }
}
