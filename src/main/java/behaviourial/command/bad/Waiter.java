package behaviourial.command.bad;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<String> orders = new ArrayList<>();

    public void takeOrder(String order) {
        orders.add(order);
        System.out.println("Waiter: Order added -> " + order);
    }

    public void placeOrders() {
        System.out.println("Waiter: Placing all orders");

        for (String order : orders) {
            if (order.equalsIgnoreCase("Pizza")) {
                Cook cook = new Pizza();
                cook.prepare();
            } else if (order.equalsIgnoreCase("Burger")) {
                Cook cook = new Burger();
                cook.prepare();
            } else {
                System.out.println("Waiter: Unknown order " + order);
            }
        }

        orders.clear();
    }
}
