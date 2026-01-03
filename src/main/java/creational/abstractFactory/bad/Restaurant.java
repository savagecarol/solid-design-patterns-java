package creational.abstractFactory.bad;


/**
 Abstract Factory provides an interface to create families of related objects without
 specifying their concrete classes.

 story
 one -> customer should not know how the food is actually created what are the ingredients process
 second -> in my restaurant we serve two cuisine italian [pizza and coke] american [burger and coke]
 third -> people can order separately as well like - just pizza
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

