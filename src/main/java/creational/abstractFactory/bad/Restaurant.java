package creational.abstractFactory.bad;

/**
 Factory Pattern creates objects without exposing the creation logic to the client.
 story - guy come and order "Pizza" and itself at the same time guy who is taking order started making food infront of you
 there is no kitchen
 if I add one more food item then we have to add one more if condition
 customer should not know recipes - ingredients process of pizza there is no abstraction
 */

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer gave order");
        String orderCuisine = "Italian";

        if (orderCuisine.equals("Italian")) {
            Pizza pizza = new Pizza();
            Coke coke = new Coke();
            pizza.prepare();
            coke.pour();
        } else if (orderCuisine.equals("American")) {
            Burger burger = new Burger();
            Coke coke = new Coke();
            burger.prepare();
            coke.pour();
        }else if (orderCuisine.equals("Pizza")){
            Pizza pizza = new Pizza();
            pizza.prepare();
        } else{
            System.out.println("Water");
        }
    }
}

