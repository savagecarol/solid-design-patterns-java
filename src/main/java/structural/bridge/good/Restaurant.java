package structural.bridge.good;

/**
 * Bridge separates abstraction from implementation.
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
 *
 *
 * BRIDGE :
 * food          type
 * burger        veg
 * pizza         non-veg
 *
 * 2 classes of food  + 2 types  = 5
 *
 * lot better than previous example:
 *
 * 20 * 7 = 140
 * 20 + bridge class + 7 = 28
 *
 */

public class Restaurant {
    public static void main(String[] args) {

        Food vegPizza = new Pizza(new Veg());
        vegPizza.prepare();

        Food nonVegBurger = new Burger(new NonVeg());
        nonVegBurger.prepare();


    }

}
