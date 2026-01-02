package behaviourial.visitor.bad;

// FoodItem interface with multiple operations (cooking, pricing, nutrition)
public interface FoodItem {
    void cookingTime();
    int getPrice();
    int getCalories();  // NEW OPERATION added later
}
