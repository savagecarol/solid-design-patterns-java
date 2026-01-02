package behaviourial.visitor.bad;

/**
 * Visitor Pattern lets you add new operations to existing object structures
 * without modifying their classes.
 *
 *  story::
 *  customer viewing order on screen::
 *      initially machine shows ::
 *          items :: cookingTime , price
 *       new requirements ::
 *          items :: cookingTime , price , calories
 *
 *  problem ::
 *      Every time you want a new operation, you must modify all classes implementing FoodItem
 *      This breaks Open/Closed Principle because classes aren’t closed for modification.
 *      If you want to add even more operations, this problem explodes.
 *
 *   Solution ::
 *
 *
 *
 */
public class Restaurant {

    public static void main(String[] args) {
        FoodItem pizza = new Pizza();
        FoodItem burger = new Burger();

        pizza.cookingTime();
        System.out.println(pizza.getPrice());
        System.out.println(burger.getCalories());

        burger.cookingTime();
        System.out.println(burger.getPrice());
        System.out.println(burger.getCalories());
    }
}
