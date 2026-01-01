package structural.decorator.good;


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
 * forr example:
 * Pizza + onion+olive = 200+20+30 = 250
 * pizza + onion+tomato+cheese =  200+30+40+20 = 290
 *
 *
 * solution : to wrap pizza with toppings dynamically
 *  so we are modifying pizza object and more we modify cost will increase
 *
 */
public class Restaurant {
    public static void main(String[] args) {
        Food pizza = new Pizza(); // add 200
        pizza = new Cheese(pizza); // add 30
        pizza = new Olives(pizza); // add 20
        System.out.println(pizza.description()); // add pizza + cheese + olives
        System.out.println("Total Cost: " + pizza.cost());
    }
}
