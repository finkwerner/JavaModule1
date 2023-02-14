package org.example;

public class Module1 extends BaseModule{          //This is a SubClass (child class)

    int duration = 16;

    String subject = "Methodologies/Project Management";

    String Test = "a test based on main concepts presented in the module";


    String location = "online only";

    public void display(){
        System.out.println("Presented " + super.location);

        // Create a Module2 class like Module1, child class of BaseModule, that is like Module1. having the following values:
        // duration = 12
        // subject = "Applied Data Visualisation"
        //Having the following values = 12, subject = "Applied Data Visualisation"
        //Projetct = "a project based on applied concepts presented in the module"
        // End of the course is: "24.10.2022"
        // Then use it to create  a AppDataVis object in the Inherit class

    }


}
