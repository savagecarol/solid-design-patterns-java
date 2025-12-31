package creational.abstractFactory.good;



public class KitchenFactory {

    // we dont need object of KitchenFactory we need it to create objects for us
    private KitchenFactory(){}

    public static Food createFood(String type) {
        if (type.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("Burger")) {
            return new Burger();
        }
        throw new IllegalArgumentException("Unknown food type");
    }
}
