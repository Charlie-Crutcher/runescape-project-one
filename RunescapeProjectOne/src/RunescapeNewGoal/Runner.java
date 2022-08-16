package RunescapeNewGoal;
import java.util.Arrays;
public class Runner {
    public static void main(String[] args){
        String[] goalCategories = {"Skilling", "Questing", "Maxing", "Diaries", "Bossing", "Clue Scrolls"};

        NextGoal firstGoal = new NextGoal("99 Magic",false);
        NextGoal secondGoal = new NextGoal("Ardougne Hard Diary",false);
        NextGoal thirdGoal = new NextGoal("99 Thieving",false);

        firstGoal.goalComplete();
        secondGoal.futureGoals();
        thirdGoal.futureGoals();

        System.out.println("The current goal genres currently consist of: "+Arrays.toString(goalCategories));
    }
}
