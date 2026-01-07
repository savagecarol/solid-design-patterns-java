package behaviourial.iinterpretor.good;

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
 * good code ::
 *      1. how many operation possible AND , OR
 *      2. so we will make two Operation class that will take left and right
 *      3. in AND , both things will be performed, in Or , one of them
 *      4. these AND , OR classes will take Expression Interface
 *      5. Burger , COKE , Pizza will implement Expression interface
 *
 *
 *  pizza and burger
 *  pizza or burger
 *
 */

public class Restaurant {
        public static void main(String[] args) {

            Expression pizza = new PizzaExpression();
            Expression coke = new CokeExpression();
            Expression burger = new BurgerExpression();

            // customer input
            Expression pizzaAndCoke = new AndExpression(pizza, coke);
            Expression burgerOrPizza = new OrExpression(burger, pizza);
            Expression burgerOrPizzaAndCoke = new AndExpression(new OrExpression(burger, pizza), coke);
            Expression burgerAndPizzaAndCoke = new AndExpression(new AndExpression(burger, pizza), coke);

            System.out.println("Order 1:");
            pizzaAndCoke.interpret();

            System.out.println("\nOrder 2:");
            burgerOrPizza.interpret();

            System.out.println("\nOrder 3:");
            burgerOrPizzaAndCoke.interpret();

            System.out.println("\nOrder 4:");
            burgerAndPizzaAndCoke.interpret();
        }
}
