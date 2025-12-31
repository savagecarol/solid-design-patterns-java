package structural.bridge.good;

// Food abstract class that takes veg and non veg types
// and send to prepare

public abstract class Food {
    public FoodType type;
    public Food(FoodType type) {
        this.type = type;
    }
    abstract void prepare();
}
