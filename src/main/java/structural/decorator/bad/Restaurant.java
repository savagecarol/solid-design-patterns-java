package structural.decorator.bad;


/**
 * Decorator Pattern adds new behavior to an object dynamically without modifying its class.
 *
 * Customer orders Pizza.
 * Then says:
 * Add extra cheese.Add olives.
 *
 * Let's say we have 100 modifications:
 * [pineapple,onion,olive,cheese,chicken, ]
 *
 * and there can be combination also
 * for example:
 * Pizza + onion+olive = 200+20+30 = 250
 * pizza + onion+tomato+cheese =  200+30+40+20 = 290
 *
 */
public class Restaurant {

    public static void main(String[] args) {
        System.out.println("Customer Order Pizza ... ");
        Pizza pizza = new PizzaWithCheese();
        System.out.println("Cost: " + pizza.cost());
    }

}
