package Functionals;

import java.util.Locale;
import java.util.Scanner;
import Skills.*;

public class XPCalculator {

    boolean repeat = true;
    Scanner input = new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m\u001B[40m";
    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_YELLOW_TEXT = "\u001B[33m";
    final String ANSI_RED_TEXT = "\u001B[31m";
    final String ANSI_GREEN_TEXT = "\u001B[32m";
    final String ANSI_PINK_TEXT = "\u001b[31;1m";
    final String ANSI_CYAN_TEXT = "\u001b[36;1m";


    public void calcRunner() {
        while (repeat) {
            int counter = 0;

            System.out.println(ANSI_PINK_TEXT+"WELCOME TO THE XP CALCULATOR...\n"+ANSI_RESET);
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN_TEXT+"-> Please enter the skill you would like to train.\n"+ANSI_RESET);
            String initialGoalSelection = input.nextLine();
            initialGoalSelection = initialGoalSelection.toLowerCase(Locale.ROOT);
            if (initialGoalSelection.equals("agility")) {
                System.out.println("You have chosen "+ANSI_CYAN_TEXT+"Agility."+ANSI_RESET);
                Agility agilityClass = new Agility();
                agilityClass.agilityMethod();
                counter++;

            } else if (initialGoalSelection.equals("attack")) {
                System.out.println("You have chosen "+ANSI_RED_TEXT+"Attack."+ANSI_RESET);
                Attack attackClass = new Attack();
                attackClass.attackMethod();
                counter++;

            } else System.out.println(ANSI_GREEN_TEXT+"Please enter a valid skill"+ANSI_RESET);

            if(counter > 0){
                System.out.println(ANSI_YELLOW_TEXT + "Would you like to select another method?");
                System.out.println("YES/NO");
                String loopRunner = input.nextLine();

                if (loopRunner.equalsIgnoreCase("no")) {
                    System.out.println(ANSI_PINK_TEXT+"What function do you require?\n"+ANSI_RESET);
                    System.out.println(ANSI_GREEN_TEXT+"-> Enter \"Goal\" to see your Goal Tracker");
                    System.out.println("-> Enter \"Calc\" to see the XP Calculator");
                    System.out.println("-> Please enter \"Exit\" if you would like to exit the program\n"+ANSI_RESET);
                    repeat = false;

                } else if (loopRunner.equalsIgnoreCase("yes")){
                    System.out.println(ANSI_YELLOW_TEXT+"Select another skill"+ANSI_RESET+ANSI_BLACK_BACKGROUND);
                } else System.out.println("Please enter a valid response.");
            }

        }


    }
}
