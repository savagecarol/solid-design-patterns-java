package structural.proxy.bad;

/**
 *  One proxy can control access to multiple real services.
 *
 * story :: same as facade but solution is different
 *  Customer comes to restaurant.
 *  He doesn’t want to talk to:
 *  kitchen
 *  Billing
 *
 */
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer come to restaurant");
        Kitchen kitchen = new Kitchen(); // Customer directly talk to kitchen for order
        Billing billing = new Billing(); // Customer directly do billing
        kitchen.cookFood();
        billing.generateBill();
    }
}
