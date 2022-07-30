package RunescapeNewGoal;
public class Runner {
    public static void main(String[] args){
        NextGoal firstGoal = new NextGoal("99 Magic",false);
        NextGoal secondGoal = new NextGoal("Ardougne Hard Diary",false);
        NextGoal thirdGoal = new NextGoal("99 Thieving",false);

        firstGoal.goalComplete();
        secondGoal.futureGoals();
        thirdGoal.futureGoals();
    }
}
