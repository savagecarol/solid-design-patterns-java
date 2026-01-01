package behaviourial.chainOfRespnosibility.bad;

public class Chef {
    public void handleOrder(String order) {
        if (order.equalsIgnoreCase("Cook Pizza") || order.equalsIgnoreCase("Cook Pasta")) {
            System.out.println("Chef prepared the order: " + order);
        } else {
            System.out.println("Chef can't prepare '" + order + "'. Passing to Manager.");
            new Manager().handleOrder(order);
        }
    }
}
