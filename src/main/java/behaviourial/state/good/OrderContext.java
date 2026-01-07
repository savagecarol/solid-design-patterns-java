package behaviourial.state.good;

public class OrderContext {

    private OrderState state; // current state

    public OrderContext() {
        this.state = new NewOrderState(); // initial state
    }

    public void setState(OrderState state) {
        this.state = state;
    } // setting the current state

    public void next() {
        state.next(this);
    }  // so it will help you to move to next state
}
