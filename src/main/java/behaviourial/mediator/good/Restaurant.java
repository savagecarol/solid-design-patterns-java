package behaviourial.mediator.good;

/**
 * Mediator Pattern defines an object that encapsulates how a set of objects interact.
 * It promotes loose coupling by preventing objects from referring to each other explicitly
 * and lets you vary their interaction independently.
 *
 * Instead of objects talking to each other directly,
 * they talk to a Mediator, and the mediator coordinates everything.
 *
 * story ::
 * customer give order to waiter::
 *      waiter :: directly talk to kitchen
 *      waiter :: directly talk to billing team
 *      waiter :: directly talk to cleaning team
 *      waiter :: directly talk to drink service team
 *
 * problem ::
 *     messy code but we need loose coupling
 *
 */
public class Restaurant {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Billing billing = new Billing();

        RestaurantMediator mediator = new RestaurantMediatorImpl(kitchen, billing);

        Waiter waiter = new Waiter(mediator);

        waiter.takeOrder("Pizza");
    }
}
