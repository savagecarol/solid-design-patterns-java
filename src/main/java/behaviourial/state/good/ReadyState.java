package behaviourial.state.good;

public class ReadyState implements OrderState {

    @Override
    public void next(OrderContext context) {
        System.out.println("Order delivered to customer.");
        context.setState(new DeliveredState());
    }
}
