package behaviourial.state.good;

public class NewOrderState implements OrderState {

    @Override
    public void next(OrderContext context) {
        System.out.println("Order placed. Start cooking.");
        context.setState(new CookingState());
    }
}
