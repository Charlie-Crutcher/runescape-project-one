package RunescapeNewGoal;
public class NextGoal {
    String goalDesc;
    boolean goalAchieved;

    public NextGoal(String goalDescription, boolean goalDone) {
        goalDesc = goalDescription;
        goalAchieved = goalDone;
    }

    public void goalComplete(){
        System.out.println("Your current goal is: "+goalDesc+".");
        if (goalAchieved) {
            System.out.println("This goal has been achieved!");
            System.out.println("Please move on to the next!");
        }
        else {
            System.out.println("This goal has not been achieved yet!");
        }
    }

    public void futureGoals(){
        System.out.println("Your next goal, following the previous' completion is: "+goalDesc+".");
    }
}
