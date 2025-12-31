package creational.factory.good;

public class KitchenFactory {

    public static Food createFood(String type) {
        if (type.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("Burger")) {
            return new Burger();
        }
        throw new IllegalArgumentException("Unknown food type");
    }
}
