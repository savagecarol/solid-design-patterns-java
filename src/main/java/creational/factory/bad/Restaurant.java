package creational.factory.bad;

/**
 Factory Pattern creates objects without exposing the creation logic to the client.
 story - guy come and order "Pizza" and itself at the same time guy who is taking order started making food
 in front of you  there is no kitchen

 if I add one more food item then we have to add one more if condition
 customer should not know recipes - ingredients process of pizza there is no abstraction
 */
public class Restaurant {
    public static void main(String[] args) {
            System.out.println("Customer gave order");
            String order = "Pizza";
            if (order.equals("Pizza")) {
                Pizza pizza = new Pizza(); // lol creating it in front of him
                pizza.prepare();
            } else if (order.equals("Burger")) {
                Burger burger = new Burger(); // lol creating it in front of him
                burger.prepare();
            }
    }
}
