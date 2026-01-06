package behaviourial.mediator.good;

public class RestaurantMediatorImpl implements RestaurantMediator {

    private Kitchen kitchen;
    private Billing billing;

    public RestaurantMediatorImpl(Kitchen kitchen, Billing billing) {
        this.kitchen = kitchen;
        this.billing = billing;
    }

    @Override
    public void placeOrder(String order) {
        kitchen.prepareFood(order);
        billing.generateBill(order);
    }


    @Override
    public void talkToChef(String order) {
        kitchen.talkToChef(order);
    }
}
