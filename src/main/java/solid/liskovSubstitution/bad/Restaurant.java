package solid.liskovSubstitution.bad;

// Objects of a superclass should be replaceable with objects of its subclasses without breaking the application
// Story 3 - Burger and pizza are cookable Food and Salad is non-cookable food
// salad = we just cut and give it to user we don't cook salad
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Lets order");
        // gave order
        Food f1 = new Pizza(); // pizza is subclass of food
        f1.prepare();
        Food f2 = new Salad(); // Salad is subclass of food
        f2.prepare();
    }
}
