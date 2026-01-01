package behaviourial.command.good;


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
 *     customer order pizza :: waiter instant go to cook make pizza then come back
 *     customer order burger :: waiter again come back and take order of burger
 *
 *     but now i want ::
 *     customer order pizza :: waiter will write pizza
 *     customer order pizza :: waiter will write burger
 *
 *          and then :: [burger,pizza] to cook
 *
 * 4 sections:
 *   1. client => talking with invoker ==> customer
 *   2. invoker => taking multiple order ==> waiter
 *   3. command => making them in one command format
 *   4. receiver => who recieve the command and perform action on them ==> cook
 *
 *
 * Benefits::
 *   it does the seperation for example :: new dish comes :: example :: Nachos
 *   we don't have to change anything in waiter , command , client
 *
 */
public class Restaurant {
    public static void main(String[] args) {
            System.out.println("Customer will give order to Waiter");
            Waiter waiter = new Waiter();

            OrderCommand pizzaOrder = new OrderCommand(new Pizza());
            OrderCommand burgerOrder = new OrderCommand(new Burger());

            System.out.println("Customer places order for Pizza and Burger");
            waiter.takeOrder(pizzaOrder);
            waiter.takeOrder(burgerOrder);

            System.out.println("\nWaiter sends all orders to cook:");
            waiter.placeOrders();
        }
    }

