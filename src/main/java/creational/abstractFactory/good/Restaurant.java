package creational.abstractFactory.good;


/**
 Abstract Factory provides an interface to create families of related objects without specifying their concrete classes.
 story
 one -> customer should not know how the food is actually created what are the ingredients process
 second -> in my restaurant we serve two cuisine italian [pizza and coke] american [burger and coke]
 third -> people can order separately as well like - just pizza
 */

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer enters restaurant");
        System.out.println("order item");

        // Case 1: Customer orders only food
        KitchenFactory.createFood("Pizza").prepare(); // normal factory

        System.out.println("order cuisine");
        // Case 2: Customer orders a cuisine (meal)
        CuisineFactory italian = new ItalianFactory(); // abstract factory
        Food food = italian.getFood();
        Drink drink = italian.getDrink();
        food.prepare();
        drink.pour();

        }
}

