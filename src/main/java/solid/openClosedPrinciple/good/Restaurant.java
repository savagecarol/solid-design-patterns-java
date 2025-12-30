package solid.openClosedPrinciple.good;

// Software entities should be open for extension but closed for modification
// Story 2 - kitchen Chaos Solution without changing new code

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer enters restaurant");
        // kitchen will cook the food
        Kitchen kitchen = new Kitchen();
        // order 1
        Food pizza = new Pizza();
        // order 2
        Food burger = new Burger();
        // we pass both the order to kitchen
        kitchen.cook(pizza);
        kitchen.cook(burger);
    }
}
