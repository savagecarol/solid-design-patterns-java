package structural.flyweight.bad;

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
 *
 */
public class Restaurant {
    public static void main(String[] args) {

        // Every order creates full pizza info — duplicated for each order
        Pizza pizza1 = new Pizza("Thin crust", "Tomato", "Cheese", 12, 5);
        Pizza pizza2 = new Pizza("Thin crust", "Tomato", "Cheese", 14, 6);
        Pizza pizza3 = new Pizza("Thin crust", "Tomato", "Cheese", 12, 7);

        pizza1.serve();
        pizza2.serve();
        pizza3.serve();
    }
}
