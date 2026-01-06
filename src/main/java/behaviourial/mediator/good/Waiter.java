package behaviourial.mediator.good;

public class Waiter {

    private RestaurantMediator mediator;

    public Waiter(RestaurantMediator mediator) {
        this.mediator = mediator;
    }

    public void takeOrder(String order) {
        System.out.println("Waiter takes order: " + order);
        mediator.placeOrder(order);
    }

    public void talkToChef(String order) {
        System.out.println("Waiter takes order: " + order);
        mediator.talkToChef(order);
    }
}
