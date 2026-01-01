package behaviourial.chainOfRespnosibility.good;

public class Waiter extends Handler {

    @Override
    public void handleOrder(String order) {
        if (order.equalsIgnoreCase("Drink") || order.equalsIgnoreCase("Salad")) {
            System.out.println("Waiter processed the order: " + order);
        } else if (nextHandler != null) {
            System.out.println("Waiter passes the order to Chef.");
            nextHandler.handleOrder(order);
        }
    }
}
