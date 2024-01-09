package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Menu.makeExercise;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        ArrayList<Exercise> exerciseList = new ArrayList<>();

        Menu menu = new Menu();

        System.out.println(menu.getIntro());
        System.out.println(menu.getMakeNewExercise());
        String answer = input.nextLine();
        //System.out.println(answer);


        exerciseList.add(makeExercise(input));
        exerciseList.add(makeExercise(input));
        exerciseList.add(makeExercise(input));

        for(int i = 0; i < exerciseList.size() - 1; i++){
            System.out.println(exerciseList.get(i).toString());
        }

//        while(!answer.equals("n")){
//
//            for(int i = 0; i < exerciseList.size() - 1; i++){
//                System.out.println(exerciseList.get(i).toString());
//            }
//
//            System.out.println(menu.getMakeNewExercise());
//            System.out.println();
//            answer = input.nextLine();
//        }

//        for(int i = 0; i < exerciseList.size() - 1; i++){
//            System.out.println(exerciseList.get(i).toString());
//        }

//        System.out.println(menu.getMakeNewExercise());
//        String secondAnswer = input.nextLine();
//        if(secondAnswer.equals("y")){
//            exerciseList.add(makeExercise(input));
//            //makeExercise(input);
//        }

        for(int i = 0; i < exerciseList.size() - 1; i++){
            System.out.println(exerciseList.get(i).toString());
        }

        System.out.println(menu.getGoodbye());

    }
}