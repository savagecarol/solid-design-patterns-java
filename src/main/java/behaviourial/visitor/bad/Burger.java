package behaviourial.visitor.bad;

public class Burger implements FoodItem {

    @Override
    public void cookingTime() {
        System.out.println("Cooking ime of burger");
    }

    @Override
    public int getPrice() {
        return 150;
    }

    @Override
    public int getCalories() {  // New operation added here too
        return 500;
    }
}
