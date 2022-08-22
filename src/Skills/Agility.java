package Skills;
import java.util.Scanner;

//future plan - adding a config file for all of print statements.
public class Agility {

    static Scanner input = new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m\u001B[40m";
    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_YELLOW_TEXT = "\u001B[33m";
    final String ANSI_RED_TEXT = "\u001B[31m";
    final String ANSI_GREEN_TEXT = "\u001B[32m";
    final String ANSI_CYAN_TEXT = "\u001b[36;1m";
    LevelVars levelVars = new LevelVars();
    int agility = levelVars.agilityLevel();

    public String agilityMethod(){
        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN_TEXT+"-> Please enter your Agility level."+ANSI_RESET);
        int agilityXPInput = Integer.parseInt(input.nextLine());
        agility = agilityXPInput;
        System.out.println("So, You're"+ANSI_RED_TEXT+" Level " +agility +ANSI_RESET+" then...\n");
        try{Thread.sleep(1000);}
        catch(InterruptedException ex){Thread.currentThread().interrupt();}

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
        return "";
    }

    //Levels 1 to 33 in Agility
    private String agilityMethod1To33(){
        final String ANSI_RESET = "\u001B[0m\u001B[40m";
        final String ANSI_RED_TEXT = "\u001B[31m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_GREEN_TEXT = "\u001B[32m";

        System.out.println(ANSI_RED_TEXT+"===== RECOMMENDED ROUTE ====="+ANSI_RESET);
        System.out.println("- Recruitment Drive (Choosing Agility Rewards)");
        System.out.println("- Tourist Trap (Choosing Agility Rewards)");
        System.out.println("- The Depths of Despair");
        System.out.println("- The Grand Tree");
        System.out.println("- Upon completion, train at Varrock Rooftop Course until 40.\n"+ANSI_RESET);
        System.out.println(ANSI_GREEN_TEXT+"-> PLEASE PRESS ENTER TO CCONTINUE..."+ANSI_RESET);
        String next = (input.nextLine());

        System.out.println(ANSI_RED_TEXT+"===== ALTERNATIVE ROUTE ====="+ANSI_RESET);
        System.out.println("- Levels 1 - 10 - Gnome Stronghold Agility Course");
        System.out.println("- Levels 10 - 20 - Draynor Village Rooftop Course");
        System.out.println("- Levels 20 - 30 - Al Kharid Rooftop Course");
        System.out.println("- Levels 30 - 40 - Varrock Rooftop Course");
        System.out.println("- Upon obtaining 40 Agility, train at Canafis Rooftop Course until 60.\n"+ANSI_RESET);
        try{Thread.sleep(1000);}
        catch(InterruptedException ex){Thread.currentThread().interrupt();}
        return"";
    }

    //Levels 33 to 40 in Agility
    private String agilityMethod33To40(){

        System.out.println(ANSI_RED_TEXT+"===== RECOMMENDED ROUTE ====="+ANSI_RESET+ANSI_BLACK_BACKGROUND);
        System.out.println("The Canafis Rooftop Course provides the highest percentage of Marks Of Grace in the game.");
        System.out.println(ANSI_RED_TEXT+"It is recommended to stay at Canafis until 60 to farm Marks of Grace."+ANSI_RESET);
        System.out.println(ANSI_RED_TEXT+"After obtaining 33 Agility via Quests, train at the Varrock Rooftop Course until 40.\n"+ANSI_RESET);
        System.out.println("PRESS ENTER TO CONTINUE...");
        String next = (input.nextLine());

        System.out.println(ANSI_RED_TEXT+"===== ALTERNATIVE ROUTE ====="+ANSI_RESET);
        System.out.println("Barbarian Fishing Provides Minor Agility and Stregth XP along with Fishing.");
        System.out.println(ANSI_RED_TEXT+"After Obtaining 52 Agility, You can progress onto the Hallowed Sepulchre."+ANSI_RESET);
        try{Thread.sleep(1000);}
        catch(InterruptedException ex){Thread.currentThread().interrupt();}
        return"";
    }

    private String agilityMethod40To60(){
        System.out.println("Train until 60 at the Canafis Rooftops.");
        return"";
    }


}
