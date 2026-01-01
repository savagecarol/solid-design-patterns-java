package behaviourial.chainOfRespnosibility.good;

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
 * Solution ::
 *
 * linked list:: ===> head = waiter
 *                    head->next = chef
 *
 *                    head = chef
 *                    head-> next = manager
 *
 *                    head = manager
 *                    head->next = NULL
 *
 */
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer will only talk to waiter\n");

        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.processOrder("Drink");
        System.out.println();

        orderProcessor.processOrder("Cook Pasta");
        System.out.println();

        orderProcessor.processOrder("VIP Pizza");
    }
}


