package behaviourial.state.good;


/**
 * State Pattern allows an object to change its behavior when its internal state changes,
 * without using lots of if-else or switch.
 *
 * The object looks like it changed its class,
 * but actually its state object changed.
 *
 *
 * story::
 * An Order in a restaurant goes through states:
 * New Order
 * Cooking
 * Ready
 * Delivered
 *
 * Behavior depends on current state.
 *
 * bad code :: 1. so many if else
 *             2. everything is happening on order class we have to change the context of order with state
 *
 * good code ::  1. make orderContext
 *               2.take state in constructor and define, initial State , nextState :: generic
 *               3. make one common state interface
 *               4. then make seperate classes that perform action and send to next state by
 *                  implementing state interface

 */

public class Restaurant {

    public static void main(String[] args) {

        OrderContext order = new OrderContext();
        order.next(); // NEW -> COOKING
        order.next(); // COOKING -> READY
        order.next(); // READY -> DELIVERED
        order.next(); // Already delivered
    }
}
