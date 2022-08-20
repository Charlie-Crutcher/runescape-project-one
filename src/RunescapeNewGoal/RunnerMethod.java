package RunescapeNewGoal;
import java.util.Scanner;
import RunescapeNewGoal.Agility.*;

public class RunnerMethod {

    boolean repeat = true;
    Scanner input = new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_YELLOW_TEXT = "\u001B[33m";
    final String ANSI_RED_TEXT = "\u001B[31m";

    public String runner() {
        while (repeat) {
            int counter = 0;

            String initialGoalSelection = input.nextLine();
            if (initialGoalSelection.equals("agility")) {
                System.out.println("You have chosen " + ANSI_RED_TEXT + "Agility." + ANSI_RESET + ANSI_BLACK_BACKGROUND);
                Agility agilityClass = new Agility();
                agilityClass.agilityMethod();
                counter++;

            } else if (initialGoalSelection.equals("attack")) {
                System.out.println("You have chosen Attack.");
                //delete when made: attackMethod();
            }

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
