package RunescapeNewGoal;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

import static RunescapeNewGoal.Agility.*;

public class Runner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_YELLOW_TEXT = "\u001B[33m";
        final String ANSI_RED_TEXT = "\u001B[31m";

        System.out.println(ANSI_BLACK_BACKGROUND+"Welcome to Charlie's Runescape Levelling Guide.");
        System.out.println("Please use lowercase when entering commands.");
        System.out.println("");
        System.out.println(ANSI_YELLOW_TEXT + "Please select the skill you would like to train: " + ANSI_RESET + ANSI_BLACK_BACKGROUND);

        for(int i = 0; i < 9999; i++) {

                String initialGoalSelection = input.nextLine();
                if (initialGoalSelection.equals("agility")) {
                    System.out.println("You have chosen " + ANSI_RED_TEXT + "Agility." + ANSI_RESET + ANSI_BLACK_BACKGROUND);
                    agilityMethod();
                    return;

                } else if (initialGoalSelection.equals("attack")) {
                    System.out.println("You have chosen Attack.");
                    //delete when made: attackMethod();
                }
        }
        System.out.println(ANSI_YELLOW_TEXT + "Would you like to select another method? Please type true OR false." + ANSI_RESET + ANSI_BLACK_BACKGROUND);
        boolean loopRunner = input.nextBoolean();
        if(loopRunner){
            System.out.println("Test complete");
        }
        else{
                System.out.println(ANSI_RED_TEXT+"Thank you for using Charlie's Runescape Levelling Guide.");
        }
    }
}


