package org.example;

public class Classes {

    String subjects;
    String level;

    int durationHR;

    public static void main(String[] args) {
        Classes Java1 = new Classes();

                Java1.subjects = "Java";
                Java1.level = "Basics";
                Java1.durationHR = 24;

                System.out.println("We are learning" + Java1.subjects+ " " + Java1.level);
    }
}
