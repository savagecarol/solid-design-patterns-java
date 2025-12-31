package creational.builder.bad;

/**
 * Pattern that is helpful in creating complex object
 *
 *  Story -> customer wants to order meal and meal is very big class like contains
 *  [food,drink,fries,extraCheese]
 *  -> maybe customer wants to take something and maybe not like want to
 *  like cheese/no-cheese
 *  fries - no fries
 *
 *  problems:
 *  Hard to read constructor
 *  Order of parameters matters
 *  Adding new option breaks code
 *
 */

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer orders meal");
        Meal meal1 = new Meal("Pizza", "Coke", true, true); // creating object in simple
        // way with constructor // and we have to make multiple constructor
        Meal meal2 = new Meal("Pizza");
        meal1.showMeal();
        meal2.showMeal();
    }
}
