package behaviourial.command.bad;

/**
 *
 *  Command Pattern turns a request into a stand-alone object that contains all information about the request.
 *  This allows you to:
 *    1. Parameterize objects with operations.
 *    2. Queue requests.
 *    3. Log requests.
 *    4. Support undo operations.
 *    The main benefit: It decouples the object that sends a request from the object that performs the request.
 *
 *
 *   story1::
 *     waiter take order in notebook
 *
 *     customer order pizza :: waiter will write pizza
 *     customer order pizza :: waiter will write burger
 *
 *          and then :: [burger,pizza] to cook
 *
 */
public class Restaurant {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        System.out.println("Customer orders Pizza:");
        waiter.takeOrder("Pizza");
        System.out.println("Customer orders Burger:");
        waiter.takeOrder("Burger");

        waiter.placeOrders();
    }
}
