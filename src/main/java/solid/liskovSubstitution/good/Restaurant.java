package solid.liskovSubstitution.good;


// Objects of a superclass should be replaceable with objects of its subclasses without breaking the application
// Story 3 - Cook able Food and Non Cook able food
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Lets order");
        Pizza pizza = new Pizza();
        pizza.getName();
        pizza.prepare();

        Salad salad = new Salad();
        salad.getName();

    }
}
