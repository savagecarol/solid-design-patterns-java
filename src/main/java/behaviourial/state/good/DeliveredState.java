package behaviourial.state.good;

public class DeliveredState implements OrderState {

    @Override
    public void next(OrderContext context) {
        System.out.println("Order already delivered. No further action.");
    }
}
