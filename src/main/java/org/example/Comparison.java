package org.example;

import java.util.Scanner;
public class Comparison {

    public static void main (String[] args) {
    // Operators are used to perform operations on variables and values

    // 1. Arithmetic operators
    // 2. Assignment operators
    // 3. Comparison operators
    // 4. Conditional operators - Logical & Ternary

    // 1. Arithmetic Operators

        /*
            +	Addition
            -	Subtraction
            *	Multiplication
            /	Division
            %	Modulus	Returns the division remainder
            ++	Increment	Increases the value of a variable by 1
            --	Decrement	Decreases the value of a variable by 1
         */

        int result = 1+2;

        System.out.println("The result is: " + result);
        System.out.println("The result is: " + 1 + 2); // Concatenate 1 and 2


        int nr = 4;

        ++nr;
        System.out.println(nr);

        // 2. Assignment

        /*


         */
        int a = 1;
        int b = 2;

        a = a + b; // a + = b;

        System.out.println(a);

        // 3. Comparison Operators:
        /*
        8>9
        8<9
        8
         */

        int val1 = 8;
        int val2 = 9;

        boolean b1 = (val1 < val2);
        System.out.println(b1);
        System.out.println(val1 != val2);

        //Comparison Operators with If Statements

        int val3 = 12;
        if(val3 == 12) {
            System.out.println("Comparison ist true");

        }

        // 4. Conditional operators - Logical & Ternary
        // 4.1 Logical Operators - OR, AND, NOT
            // OR - ||

        if(val3 == 9 || val3 == 11 || val3 == 12) {


            System.out.println("One match is found");
        }

            // AND &&


        if(val3 > 9 && val3 <= 13) {


                System.out.println("One match is found");

                // NOT - !
                Scanner scan1 = new Scanner(System.in);

                System.out.println("To log out, press y or Y");

                String input = scan1.next();

                if(!input.equals("y") && !input.equals("Y")){

                }

                else {

                    System.out.println("You have logged out");

                }

            // 4.2 Ternary Operator

            int x = (5 > 2) ? 5 : 2;
            String y = (5 < 2) ? "True" : "False";

            System.out.println(x);
            System.out.println(y);




            }

    }
}
