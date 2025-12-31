package solid.dependencyInversion.bad;

//High-level modules should not depend on low-level modules. Both should depend on abstractions.
// a person who is taking order - directly responsible for making pizza
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer orders Pizza");
        OrderService orderService = new OrderService();
        orderService.processOrder();
    }
}
