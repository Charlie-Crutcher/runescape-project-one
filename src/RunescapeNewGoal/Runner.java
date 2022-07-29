package RunescapeNewGoal;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args){
        Scanner myGoal = new Scanner(System.in); //Creates our Scanner object
        System.out.println("Enter your next goal");

        String myNextGoal = myGoal.nextLine();
        System.out.println("Your next goal is: " + myNextGoal);

        String myNextGoalComplete = myGoal.nextLine();

        System.out.println("Is this goal completed? Please type 'yes' or 'no'");
        if(myNextGoalComplete.equals("yes")){
            System.out.println("Your next goal is: " + myNextGoal);
        }
        else if(myNextGoalComplete.equals("no")){
            System.out.println("Back to grinding!");
        }
        else{
            System.out.println("Please enter 'yes' or 'no'!");
        }

        NextGoal firstGoal = new NextGoal(NextGoal.GoalType.SKILLING,myNextGoal,true);

        firstGoal.checkGoal();
    }
}
