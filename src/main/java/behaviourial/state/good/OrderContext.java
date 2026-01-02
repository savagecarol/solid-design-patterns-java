package behaviourial.state.good;

public class OrderContext {

    private OrderState state;

    public OrderContext() {
        this.state = new NewOrderState(); // initial state
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }
}
