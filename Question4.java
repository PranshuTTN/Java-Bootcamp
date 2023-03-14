abstract class Goal{
    protected String typeOfGoal;
    protected int distance;
    public void getTypeOfGoal(){
        System.out.println("Goallllllllll");
        System.out.println("Type of goal: " + typeOfGoal);
        System.out.println("Distance from goal post: " + distance + "m");
    }
    public abstract void setTypeOfGoal(String typeOfGoal,int distance);
}
class Penalty extends Goal{
    @Override
    public void setTypeOfGoal(String t, int d) {
        typeOfGoal=t;
        distance=d;
    }
}class FreeKick extends Goal{
    @Override
    public void setTypeOfGoal(String t, int d) {
        typeOfGoal=t;
        distance=d;
    }
}class Corner extends Goal{
    @Override
    public void setTypeOfGoal(String t, int d) {
        typeOfGoal=t;
        distance=d;
    }
}
class GoalFactory{
    public Goal getTypeOfGoal(String s){
        if (s==null){
            return null;
        }
        if(s.equalsIgnoreCase("Penalty")){
            return new Penalty();
        } else if (s.equalsIgnoreCase("FreeKick")){
            return new FreeKick();
        } else {
            return new Corner();
        }
    }
}
public class Question4 {
    public static void main(String[] args) {
        Goal g = new GoalFactory().getTypeOfGoal("Corner");
        g.setTypeOfGoal("Header",20);
        g.getTypeOfGoal();
    }
}