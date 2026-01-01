package behaviourial.command.good;// Waiter.java
import java.util.ArrayList;
import java.util.List;

// invoker
public class Waiter {
    private List<Command> orderList = new ArrayList<>();

    public void takeOrder(Command command) {
        orderList.add(command);
        System.out.println("Waiter: Order taken.");
    }

    public void placeOrders() {
        System.out.println("Waiter: Placing all orders.");
        for (Command command : orderList) {
            command.execute();
        }
        orderList.clear();
    }
}
