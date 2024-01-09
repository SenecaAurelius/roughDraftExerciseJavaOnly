package org.example;

import java.util.Scanner;

public class Menu {

    //TODO
    /*
    * Create a menu to Create, Read, Update, and Delete Exercises
    * Update their
    *
    *
    * */

    private String intro = "Welcome to the Exercise App";
    private String makeNewExercise = "Would you like to enter a new exercise? (y or n) ";

    private String goodbye = "Have a great day!";

    public Menu(){

    }

    public static Exercise makeExercise(Scanner input){
        Exercise exercise1 = new Exercise();
        System.out.println("Please enter the name of the exercise : ");

        String nameOfExercise = input.nextLine();

//        input.nextLine();
        exercise1.setName(nameOfExercise);

        System.out.println("Please enter the number of repetitions : ");
        int repetitions = input.nextInt();

        input.nextLine();

        exercise1.setRepetitions(repetitions);

        System.out.println(exercise1.toString());

        return exercise1;
    }

    public String getIntro() {
        return intro;
    }

    public String getMakeNewExercise() {
        return makeNewExercise;
    }

    public String getGoodbye() {
        return goodbye;
    }

}
