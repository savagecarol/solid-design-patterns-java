package behaviourial.chainOfRespnosibility.good;

// Chef.java
public class Chef extends Handler {
    @Override
    public void handleOrder(String order) {
        if (order.equalsIgnoreCase("Cook Pizza") || order.equalsIgnoreCase("Cook Pasta")) {
            System.out.println("Chef prepared the order: " + order);
        } else if (nextHandler != null) {
            System.out.println("Chef passes the order to Manager.");
            nextHandler.handleOrder(order);
        }
    }
}
