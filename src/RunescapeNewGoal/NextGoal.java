package RunescapeNewGoal;

public class NextGoal {

    String goalDesc;
    boolean goalAchieved;

    public enum GoalType {
        SKILLING,
        QUESTING,
        COMBAT,
        DIARIES,
        HUSTLING
    }

    public void checkGoal(){
        if(goalAchieved){
            System.out.println("This goal has been completed!");
        }
        else{
            System.out.println("This goal has not been completed yet!");
        }
    }

    public NextGoal(GoalType goalType, String goalDescription, boolean goalCompleted){
        goalDesc = goalDescription;
        goalAchieved = goalCompleted;
    }

}
