package structural.proxy.good;

// proxy layer who will lazy load when customer ask for something
public class WaiterProxy implements RestaurantService {

    private Kitchen kitchen;
    private Billing billing;

    @Override
    public void placeOrder() {

        if (kitchen == null) {
            kitchen = new Kitchen(); // lazy loading
        }

        System.out.println("Waiter forwards order to kitchen");
        kitchen.cookFood();
    }

    @Override
    public void getBill() {

        if (billing == null) {
            billing = new Billing(); // lazy loading
        }

        System.out.println("Waiter requests billing");
        billing.generateBill();
    }
}
