package RunescapeNewGoal;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//future plan - adding a config file for all of print statements.
public class Attack {

    static Scanner input = new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m\u001B[40m";
    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_YELLOW_TEXT = "\u001B[33m";
    final String ANSI_RED_TEXT = "\u001B[31m";

    LevelVars levelVars = new LevelVars();
    int attack = levelVars.attackLevel();

    public String attackMethod(){
        System.out.println("Please enter your Agility level.");
        int attackXPInput = Integer.parseInt(input.nextLine());
        attack = attackXPInput;
        System.out.println("So, You're Level " +attack +" then...");
        try{Thread.sleep(1000);}
        catch(InterruptedException ex){Thread.currentThread().interrupt();}


        if(attackXPInput >= 1 && attackXPInput < 33){
            return attackMethod1();
        }
        /*else if(attackXPInput >= 33 && attackXPInput <= 39){
            return attackMethod2();
        }
        else if(attackXPInput >= 40 && attackXPInput <= 59){
            return attackMethod3();
        }
        else if(attackXPInput >= 60 && attackXPInput <= 69){
            //attackMethod()
        }*/
        return "";
    }

    //Levels 1 to 33 in Agility
    private String attackMethod1(){
        return "";
    }



}
