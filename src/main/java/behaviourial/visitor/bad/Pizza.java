package behaviourial.visitor.bad;

public class Pizza implements FoodItem {

    @Override
    public void cookingTime() {
        System.out.println("CookingTime of pizza");
    }

    @Override
    public int getPrice() {
        return 300;
    }

    @Override
    public int getCalories() {   // New operation added here
        return 800;
    }
}
