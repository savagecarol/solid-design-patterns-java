package creational.prototype.good;


/**
 * Prototype Pattern creates new objects by copying an existing object.
 * Story 1 : Same meal ordered again → recreate manually.
 *
 * use cloneable interface and implement it
 * and override clone function and pass all the parameter
 *
 * --> usually use it when creating of object is very heavy - example - so many parameters
 * it can help you do actual work -> you will not waste time on creating object
 */

public class Restaurant {

    public static void main(String[] args) {
        System.out.println("Customer gave meal order");
        Meal meal1 = new Meal("Pizza", "Coke", true);
        System.out.println("Customer want same order again");
        // Clone the meal
        Meal meal2 = meal1.clone();
        meal2.setDrink("Red Bull");
        meal1.showMeal();
        meal2.showMeal();
    }
}
