public abstract class BaseRoom {

    public BaseRoom()
    
    private String description;
    private int capacity;
    private double costPerHour;
    private MealPlan MealPlan;

    public abstract int getFinalCost();
    public abstract void createRoom(Baseroom room);
}