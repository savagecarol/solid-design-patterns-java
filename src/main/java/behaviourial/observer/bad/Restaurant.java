package behaviourial.observer.bad;

/**
 * Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are automatically notified.
 *
 * publisher-subscribers
 *
 * story ::
 *  customer placed and order and all the services should be notified
 *  example :: customer placed an order on screen:
 *          bill generation
 *          order should be visible on diplay
 *          order instructions reach to kitchen
 *
 * simple approach :: make orderService and call services one by one
 *
 */
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer placed an order");
        OrderService service = new OrderService();
        service.placeOrder("Pizza");
    }
}
