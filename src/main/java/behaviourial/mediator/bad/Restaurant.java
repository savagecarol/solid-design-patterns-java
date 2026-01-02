package behaviourial.mediator.bad;

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
 *
 * Mediator Pattern removes chaos by introducing a central coordinator for communication.
 */
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer give order to waiter");
        Waiter waiter = new Waiter();
        waiter.takeOrder("Pizza");
    }
}
