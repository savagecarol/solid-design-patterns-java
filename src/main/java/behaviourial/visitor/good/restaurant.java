package behaviourial.visitor.good;

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
 *   FoodItem classes (Pizza, Burger) don’t change even when we add new operations like Calories.
 *   Each operation is encapsulated in a separate visitor.
 *   Adding a new operation means creating a new visitor class only.
 *   This keeps the design open for extension, closed for modification.
 *
 */
public class restaurant {

    public static void main(String[] args) {

        // food itema ==> FoodItem interface  --> callable function takes FoodVisitor
        FoodItem[] menu = {
            new Pizza(),
            new Burger()
        };

        // three type of food visitor and each food visitor for food item
        FoodVisitor cookingTimeVisitor = new CookingTimeVisitor();
        FoodVisitor priceVisitor = new PriceVisitor();
        FoodVisitor caloriesVisitor = new CaloriesVisitor();

        System.out.println("Customer ordering from machine:");

        for (FoodItem item : menu) {
            item.accept(cookingTimeVisitor);
            item.accept(priceVisitor);
            item.accept(caloriesVisitor);
            System.out.println();
        }
    }
}