package behaviourial.state.good;

public class CookingState implements OrderState {

    @Override
    public void next(OrderContext context) {
        System.out.println("Order cooked. Ready to serve.");
        context.setState(new ReadyState());
    }
}
