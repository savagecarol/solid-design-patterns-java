package behaviourial.observer.bad;

public class OrderService {

    private Kitchen kitchen = new Kitchen();
    private Billing billing = new Billing();
    private Display display = new Display();

    public void placeOrder(String order) {
        System.out.println("Order placed: " + order);

        kitchen.prepareFood(order);
        billing.generateBill(order);
        display.showOrder(order);
    }
}
