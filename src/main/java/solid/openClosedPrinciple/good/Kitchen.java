package solid.openClosedPrinciple.good;

// responsibility is to cook the food
public class Kitchen {

    public void cook(Food food) {
        food.prepare();
    }
}
