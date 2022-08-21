package RunescapeNewGoal;
import java.util.Locale;
import java.util.Scanner;
import RunescapeNewGoal.Agility.*;
import java.util.concurrent.TimeUnit;

public class RunnerMethod {

    boolean repeat = true;
    Scanner input = new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m\u001B[40m";
    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_YELLOW_TEXT = "\u001B[33m";
    final String ANSI_RED_TEXT = "\u001B[31m";
    final String ANSI_GREEN_TEXT = "\u001B[32m";

    public String runner() {
        while (repeat) {
            int counter = 0;

            String initialGoalSelection = input.nextLine();
            initialGoalSelection = initialGoalSelection.toLowerCase(Locale.ROOT);
            if (initialGoalSelection.equals("agility")) {
                System.out.println("You have chosen "+ANSI_GREEN_TEXT+"Agility."+ANSI_RESET);
                Agility agilityClass = new Agility();
                agilityClass.agilityMethod();
                counter++;

            } else if (initialGoalSelection.equals("attack")) {
                System.out.println("You have chosen "+ANSI_RED_TEXT+"Attack."+ANSI_RESET);
                Attack attackClass = new Attack();
                attackClass.attackMethod();
                counter++;

            } else System.out.println("Please enter a valid skill");

            if(counter > 0){
                System.out.println(ANSI_YELLOW_TEXT + "Would you like to select another method? Please type true OR false." + ANSI_RESET + ANSI_BLACK_BACKGROUND);
                boolean loopRunner = input.nextBoolean();
                if (!loopRunner) {
                    repeat = false;
                } else System.out.println(ANSI_YELLOW_TEXT+"Select another skill"+ANSI_RESET+ANSI_BLACK_BACKGROUND);
            }

        }
        return"";


    }
}
