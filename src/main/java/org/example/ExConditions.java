package org.example;

import java.util.Scanner;

public class ExConditions {

  /*
    Write a program that accepts a test grade and prints out the following statements:
    - "Insufficient" if the grade is less than 5
    - "Sufficient" if the grade is between 5 and 6
    - "Good" if the grade is greater than 6 and smaller than 9
    - "Very good" if the grade is greater than 8
    */

    public static void main (String[] args){



                Scanner scan = new Scanner(System.in);
                System.out.print("Enter your test grade: ");

                double Grade = scan.nextDouble();

                if (Grade < 5) {
                    System.out.println("Insufficient");
                } else if (Grade >= 5 && Grade <= 6) {
                    System.out.println("Sufficient");
                } else if (Grade > 6 && Grade < 9) {
                    System.out.println("Good");
                } else if (Grade >= 9) {
                    System.out.println("Very good");
                }
            }












}