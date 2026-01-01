package structural.bridge.bad;

/**
 * Bridge separates abstraction from implementation.
 *
 * // combination
 *
 * think like cross multiplication
 *
 * food          type
 * burger        veg
 * pizza         non-veg
 * pasta         vegan
 *
 * total number of classes we will make = 3*3 = 9
 * total number of classes we will make if we add one more type = 3*4 = 12
 *
 * Story ::
 * Food can be Burger or Pizza.
 * Each food can be Veg or Non-Veg.
 * If we combine them directly, classes will explode.
 *
 * Too many classes
 * Hard to maintain
 * Adding new food or type doubles classes
 */

public class Restaurant {
    public static void main(String[] args) {
        VegPizza pizza = new VegPizza();
        pizza.prepare();

        NonVegBurger burger = new NonVegBurger();
        burger.prepare();
    }
}
