package Exceptions;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        try {
            int[] ar1 = {1, 2, 3};

            System.out.println(ar1[3]);

        } catch (Exception e) {
            System.out.println("No value for that index");
            System.out.println(e);

        }

        //Ex. 2

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the first nr");
        int nr1 = scan1.nextInt();
        System.out.println("Please enter the second nr");

        int nr2 = scan1.nextInt();

        try {
            int div = nr1 / nr2;
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("Can`t devide by 0");
        } finally {
            System.out.println("End of the execution");
        }
    }}