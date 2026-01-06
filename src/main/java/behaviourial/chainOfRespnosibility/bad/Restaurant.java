package behaviourial.chainOfRespnosibility.bad;

/**
 * Chain of Responsibility is a behavioral design pattern where a request passes along a chain of handlers.
 * Each handler can either process the request or forward it to the next handler,
 * reducing tight coupling between sender and receiver.
 *
 * Story ::
 *  customer 1 :: waiter :: drinks and salad
 *
 *  customer 2 :: waiter :: pizza
 *              :: waiter :: chef :: pizza
 *
 *  customer 2 :: waiter :: family pack pizza - VIP pizza
 *               waiter :: chef :: manager :: family pack pizza = VIP pizza
 *
 *
 */
public class Restaurant {

    public static void main(String[] args) {
        System.out.println("Customer will only talk to waiter");
        System.out.println();
        Waiter waiter = new Waiter();
        waiter.handleOrder("Drink"); // waiter will process it
        System.out.println();
        waiter.handleOrder("Cook Pasta");  // chef
        System.out.println();
        waiter.handleOrder("VIP Pizza"); // manager
    }
}
