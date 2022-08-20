package RunescapeNewGoal;
import java.awt.*;
import java.util.Scanner;
import java.io.*;

//future plan - adding a config file for all of print statements.
public class Agility {

    static Scanner input = new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_YELLOW_TEXT = "\u001B[33m";

    public String agilityMethod(){
        System.out.println("Please enter your Agility level.");
        int agilityXPInput = Integer.parseInt(input.nextLine());

        if(agilityXPInput >= 1 && agilityXPInput < 33){
            return agilityMethod1To33();
        }
        else if(agilityXPInput >= 33 && agilityXPInput <= 39){
            return agilityMethod33To40();
        }
        else if(agilityXPInput >= 40 && agilityXPInput <= 59){
            return agilityMethod40To60();
        }
        else if(agilityXPInput >= 60 && agilityXPInput <= 69){
            //agilityMethod60To70()
        }
        return "knob-head";
    }

    //Levels 1 to 33 in Agility
    private String agilityMethod1To33(){
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED_TEXT = "\u001B[31m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_GREEN_TEXT = "\u001B[32m";

        System.out.println(ANSI_RED_TEXT+"===== RECOMMENDED ROUTE: Questing to 33 ====="+ANSI_RESET+ANSI_BLACK_BACKGROUND);
        System.out.println("- Recruitment Drive (Choosing Agility Rewards)");
        System.out.println("- Tourist Trap (Choosing Agility Rewards)");
        System.out.println("- The Depths of Despair");
        System.out.println("- The Grand Tree");
        System.out.println(ANSI_GREEN_TEXT+"After obtaining 33 Agility via Quests, train at the Varrock Rooftop Course until 40.");
        System.out.println(ANSI_RESET+ANSI_BLACK_BACKGROUND);

        System.out.println(ANSI_RED_TEXT+"===== ALTERNATIVE ROUTE: Agility Courses to 33 ====="+ANSI_RESET+ANSI_BLACK_BACKGROUND);
        System.out.println("Levels 1 - 10 - Gnome Stronghold Agility Course");
        System.out.println("Levels 10 - 20 - Draynor Village Rooftop Course");
        System.out.println("Levels 20 - 30 - Al Kharid Rooftop Course");
        System.out.println("Levels 30 - 40 - Varrock Rooftop Course");
        System.out.println(ANSI_GREEN_TEXT+"After obtaining 40 Agility, move onto Canafis Rooftop Course until 60.");
        System.out.println(ANSI_RESET+ANSI_BLACK_BACKGROUND);
        return"Select another skill";
    }

    //Levels 33 to 40 in Agility
    private String agilityMethod33To40(){
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED_TEXT = "\u001B[31m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_GREEN_TEXT = "\u001B[32m";

        System.out.println(ANSI_RED_TEXT+"===== RECOMMENDED ROUTE: Canafis Rooftop Course ====="+ANSI_RESET+ANSI_BLACK_BACKGROUND);
        System.out.println("The Canafis Rooftop Course provides the highest percentage of Marks Of Grace in the game.");
        System.out.println(ANSI_GREEN_TEXT+"It is recommended to stay at Canafis until 60 to farm Marks of Grace.");
        System.out.println(ANSI_RESET+ANSI_BLACK_BACKGROUND);

        System.out.println(ANSI_RED_TEXT+"===== ALTERNATIVE ROUTE: Barbarian Fishing ====="+ANSI_RESET+ANSI_BLACK_BACKGROUND);
        System.out.println("Barbarian Fishing Provides Minor Agility and Stregth XP along with Fishing.");
        System.out.println(ANSI_GREEN_TEXT+"After Obtaining 52 Agility, You can progress onto the Hallowed Sepulchre.");
        System.out.println(ANSI_RESET+ANSI_BLACK_BACKGROUND);
        return"";
    }

    private String agilityMethod40To60(){
        System.out.println("Train until 60 at the Canafis Rooftops.");
        return"";
    }


}
