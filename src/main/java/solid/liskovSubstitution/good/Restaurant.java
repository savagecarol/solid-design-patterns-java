package solid.liskovSubstitution.good;


// Objects of a superclass should be replaceable with objects of its subclasses without breaking the application
// Story 3 - Cook able Food and Non Cook able food
// and pizza is type of both food and cookable food
// salad is just type of Food
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Lets order");
        CookableFood pizza = new Pizza(); // FOOD , Cookable
        pizza.getName(); // yes we can serve pizza
        pizza.prepare(); // it will actually make pizza

        Food salad = new Salad(); // FOOD class
        salad.getName(); // yes we can serve salad

    }
}
