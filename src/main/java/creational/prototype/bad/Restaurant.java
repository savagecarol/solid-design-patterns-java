package creational.prototype.bad;

/**
 * Prototype Pattern creates new objects by copying an existing object.
 * Story 1 : Same meal ordered again → recreate manually.
 *
 * here we are passing the meal object one more time completely
 * creating everything from scratch
 * Setting everything again
 */
public class Restaurant {

    public static void main(String[] args) {
        System.out.println("Customer gave meal order");
        Meal meal1 = new Meal("Pizza", "Coke", true);
        System.out.println("Customer want same order again");
        Meal meal2 = new Meal("Pizza", "Coke", true);
        meal1.showMeal();
        meal2.showMeal();
    }
}
