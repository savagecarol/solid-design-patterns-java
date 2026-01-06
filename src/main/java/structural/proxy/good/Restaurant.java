package structural.proxy.good;

/**
 *  One proxy can control access to multiple real services.
 *
 * story :: same as facade but solution is different
 *  Customer comes to restaurant.
 *  He doesn’t want to talk to:
 *  kitchen
 *  Billing
 *
 *
 * Solution :: we will make waiter
 * waiter will act as proxy to actual object :: kitchen and Billing
 * so customer will only talk to waiter
 *  ===> waiter is not actual person who is doing. work is done by kitchen and billing
 *
 * it sounds like Facade because we use counter
 *
 * difference::
 * Facade simplifies usage.
 * Proxy controls access.
 * Here waiter is controlling access, so it’s Proxy.
 */
public class Restaurant {

    public static void main(String[] args) {
        System.out.println("Customer come to restaurant");
        RestaurantService waiter = new WaiterProxy(); // waiter proxy
        waiter.placeOrder(); // only kitchen called
        waiter.getBill();    // only billing called
    }
}
