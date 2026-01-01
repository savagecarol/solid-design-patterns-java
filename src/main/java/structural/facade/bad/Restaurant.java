package structural.facade.bad;

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
 *
 */
public class Restaurant {
    public static void main(String[] args) {

        System.out.println("Customer order");
        Kitchen kitchen = new Kitchen(); // Customer directly talk to kitchen for order
        Chef chef = new Chef(); // Customer directly talking to chef please add some toppings
        Waiter waiter = new Waiter();  // Customer talk to waiter
        Billing billing = new Billing(); // Customer do billing

        kitchen.prepareFood();
        chef.cook();
        waiter.serve();
        billing.generateBill();
    }
}
