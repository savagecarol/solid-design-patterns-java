package structural.facade.good;

/**
 * Facade Pattern provides a simple interface to a complex system.
 *
 * Story ::
 *  Customer comes to restaurant.
 *  He doesn’t want to talk to:
 *  Kitchen
 *  Chef
 *  Billing
 *  Waiter
 *
 *  now think of this like we have Counter where all the actions will be performed
 *
 *  so customer will only talk to counter and nothing else
 *  so by this we will hide all the complexity just by adding Restaurant Facade
 *
 */
public class Restaurant {
    public static void main(String[] args) {
        RestaurantFacade facade = new RestaurantFacade();
        facade.serveCustomer();
    }
}
