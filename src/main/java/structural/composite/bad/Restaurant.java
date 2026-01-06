package structural.composite.bad;

import java.util.Arrays;

/**
 * Composite Pattern is used when objects are organized in a tree structure.
 *
 * // Hierarchy
 *
 * Main Menu:
 *      Veg Menu:
 *          Burger
 *          Pizza
 *          nachos
 *      Non-Veg Menu:
 *          Chicken Burger
 *          Chicken Pizza
 *
 * customer :: want to make menu like this
 *
 * Bridge :: it is not variation like Bridge. This is hierarchy like a tree.
 *
 */
public class Restaurant {

    public static void main(String[] args) {
        VegMenu vegMenu = new VegMenu(Arrays.asList("Burger", "Pizza", "Veg Nachos"));
        NonVegMenu nonVegMenu = new NonVegMenu(Arrays.asList("Chicken Burger", "Chicken Pizza"));
        vegMenu.showVegMenu();
        nonVegMenu.showNonVegMenu();
    }

}
