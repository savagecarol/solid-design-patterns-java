package behaviourial.iinterpretor.bad;


/**
 *  Interpreter Pattern is used to define a grammar and provide a way to interpret sentences in that grammar.
 *  Convert human-like commands into meaningful actions.
 *
 *  story::
 *  Pizza AND Coke
 *  Burger OR Pizza
 *
 * The system must interpret this text and understand:
 * what food
 * how many
 * how to process it
 *
 * bad code:: string is passing everywhere
 *              no structure just if and else condition
 *
 */

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer order pizza and cake");
        RestaurantOrderProcessor processor = new RestaurantOrderProcessor();
        processor.process("Pizza AND Coke");
    }
}
