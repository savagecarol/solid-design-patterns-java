package structural.flyweight.good;


/**
 * Flyweight is a structural design pattern used to reduce memory
 * usage by sharing as much data as possible with similar objects.
 * It distinguishes between:
 *
 * story::
 * imagine a busy restaurant where many customers order pizzas.
 * Each pizza has common details: dough, sauce, toppings (intrinsic state).
 * Each order has unique details: size, table number (extrinsic state).
 *
 * solution:
 * If we create a full pizza object with all details for every order, it wastes memory.
 *
 * // think 9: pm
 * and only 1 pizza type is left in restaurant and everyone is sitting on different table
 */
public class Restaurant {
    public static void main(String[] args) {

        Pizza sharedPizza = new Pizza("Thin crust", "Tomato", "Cheese"); // created once
        PizzaOrder order1 = new PizzaOrder(sharedPizza, 12, 5);
        PizzaOrder order2 = new PizzaOrder(sharedPizza, 14, 6);
        PizzaOrder order3 = new PizzaOrder(sharedPizza, 12, 7);

        order1.serve();
        order2.serve();
        order3.serve();
    }
}
