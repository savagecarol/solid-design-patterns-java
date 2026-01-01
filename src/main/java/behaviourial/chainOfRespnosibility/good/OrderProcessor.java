package behaviourial.chainOfRespnosibility.good;

/**
 * this the place where you define the actual steps
 *
 * processor or you can say chain
 *
 * here you will connect the handlers with each other like linked list
 */
public class OrderProcessor {
    private Handler handlerChain;

    public OrderProcessor() {
        buildChain();
    }

    private void buildChain() {
        Handler waiter = new Waiter();
        Handler chef = new Chef();
        Handler manager = new Manager();

        waiter.setNextHandler(chef);
        chef.setNextHandler(manager);

        this.handlerChain = waiter;
    }

    public void processOrder(String order) {
        handlerChain.handleOrder(order);
    }
}
