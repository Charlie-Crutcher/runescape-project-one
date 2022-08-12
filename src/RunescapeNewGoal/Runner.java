package RunescapeNewGoal;
import java.util.Arrays;
import java.util.Scanner;
public class Runner {

    Agility runAgility = new Agility();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ver: 0.1");
        System.out.println("Welcome to Charlie's Runescape Goal Tracker & Calculator.");
        System.out.println("Standby for updates and new versions with updated features and methods.");

        System.out.println("Please use lowercase when entering commands.");
        System.out.println("Please select the skill you would like to train: ");
            String initialGoalSelection = input.nextLine();
            System.out.printf("You Entered "+initialGoalSelection);

        if(initialGoalSelection.equals("agility")){
            initialGoalSelection.Agility();
        }


    }
}
