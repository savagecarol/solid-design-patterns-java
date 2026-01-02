package behaviourial.observer.good;

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
 *  problem :: Order class manually calls everyone
 *          :: tight Coupling
 *
 *
 *   other approach ::
 *
 *   orderService :: publisher --> and publish
 *   billing, display, kitchen :: when program start they will already subscribe :: orderService
 *
 *   and when something happen to OrderService an event will be published to all the subscribers
 */
public class Restaurant {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.addObserver(new Kitchen()); // subscribing
        orderService.addObserver(new Billing()); // subscribing
        orderService.addObserver(new Display()); // subscribing

        orderService.placeOrder("Pizza"); // placing order
        System.out.println();

        orderService.placeOrder("Burger");
    }
}
