package behaviourial.template.bad;

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
 *
 */
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Process Pizza order");
        new PizzaOrder().processOrder();
        System.out.println();
        System.out.println("Process Burger order");
        new BurgerOrder().processOrder();
    }
}
