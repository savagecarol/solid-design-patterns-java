package behaviourial.template.good;

/**
 * Template Method Pattern defines the skeleton of an algorithm in a base class
 * and lets subclasses override specific steps without changing the overall structure.
 * and we can modify some steps according to our needs
 *
 * story::
 *  customer comes and process order
 *  4 step:: take order , make food , serving , billing
 *
 *  making food is dynamic as :: pizza making is different from burger making
 *
 *  problem::
 *      code repetition
 *      Each class implements full process
 *
 * solution::
 *      1. we will use abstract class to implement FoodOrderTemplate
 *      2. common functions in abstract function
 *      3. and all the dynamic functions are abstract and implemented by other classes
 */
public class Restaurant {

    public static void main(String[] args) {
        FoodOrderTemplate pizza = new PizzaOrder();

        pizza.processOrder();
        System.out.println();
        FoodOrderTemplate burger = new BurgerOrder();
        burger.processOrder();
    }
}
