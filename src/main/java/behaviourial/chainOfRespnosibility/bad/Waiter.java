package behaviourial.chainOfRespnosibility.bad;

public class Waiter {
    public void handleOrder(String order) {
        if (order.equalsIgnoreCase("Drink") || order.equalsIgnoreCase("Salad")) {
            System.out.println("Waiter processed the order: " + order);
        } else {
            System.out.println("Waiter can't process '" + order + "'. Passing to Chef.");
            new Chef().handleOrder(order);
        }
    }
}
