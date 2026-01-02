package behaviourial.mediator.bad;

public class Waiter {

    private Kitchen kitchen = new Kitchen();
    private Billing billing = new Billing();

    public void takeOrder(String order) {
        System.out.println("Waiter takes order: " + order);
        kitchen.prepareFood(order); // talk with kitchen to prepare food
        billing.generateBill(order);  // talk with billing directly
    }
}
