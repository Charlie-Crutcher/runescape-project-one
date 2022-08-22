package Functionals;

import java.util.Locale;
import java.util.Scanner;

public class InitialSelection {

    //Declaring var "input" as our scanner object and declaring ANSI word colours.
    Scanner input = new Scanner(System.in);
    boolean repeat = true;
    final String ANSI_RESET = "\u001B[0m\u001B[40m";
    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_YELLOW_TEXT = "\u001B[33m";
    final String ANSI_RED_TEXT = "\u001B[31m";
    final String ANSI_PINK_TEXT = "\u001b[31;1m";
    final String ANSI_GREEN_TEXT = "\u001B[32m";

    public String initialUserSelection() {
        //Start-up messages
        System.out.println(ANSI_PINK_TEXT+ANSI_BLACK_BACKGROUND+"WELCOME TO RUNEGOALS...\n");

        System.out.println(ANSI_YELLOW_TEXT+"Loading.");
        try{Thread.sleep(750);}
        catch(InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.println(ANSI_YELLOW_TEXT+"Loading..");
        try{Thread.sleep(750);}
        catch(InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.println(ANSI_YELLOW_TEXT+"Loading...\n"+ANSI_RESET);
        try{Thread.sleep(750);}
        catch(InterruptedException ex){Thread.currentThread().interrupt();}

        System.out.println(ANSI_RED_TEXT+"What function do you require?\n"+ANSI_RESET);
        try{Thread.sleep(1000);}
        catch(InterruptedException ex){Thread.currentThread().interrupt();}
        System.out.println(ANSI_GREEN_TEXT+"-> Please enter \"Goal\" to see your Goal Tracker");
        System.out.println("-> Please enter \"Calc\" to see the XP Calculator");
        System.out.println("-> Please enter \"Exit\" if you would like to exit the program\n"+ANSI_RESET);

        while (repeat) {
            int counter = 0;

            //Declaring a scanner variable called "selection"  and asking for user input.
            String selection = input.nextLine();

            //If Statement to check if user wants goal tracker or xp calculator.
            if (selection.equalsIgnoreCase("goal")) {
                GoalTracker goalTracker = new GoalTracker();
                goalTracker.goalRunner();
                counter++;

            } else if (selection.equalsIgnoreCase("calc")) {
                XPCalculator xpCalculator = new XPCalculator();
                xpCalculator.calcRunner();
                counter++;

            } else if(selection.equalsIgnoreCase("exit")){
                return"";

            } else System.out.println(selection+" is not a valid function!");
        }
        return"";
    }
}
